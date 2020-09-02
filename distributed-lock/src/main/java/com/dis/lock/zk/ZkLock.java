package com.dis.lock.zk;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.exception.ZkNodeExistsException;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author: lisy
 * @version: : ZkLock , v0.1 2020年06月07日 6:57 下午
 * @remark: the ZkLock is zk 分布式锁 但是会存在惊群响应
 */
public class ZkLock implements Lock {

    private String lockPath;

    private ZkClient zkClient;

    private ThreadLocal<Integer> counts = new ThreadLocal<>();

    public ZkLock(String lockPath){
        super();
        this.lockPath = lockPath;
        zkClient = new ZkClient("127.0.0.1:2181");
        zkClient.setZkSerializer(new MyZkSerializer());
    }

    @Override
    public void lock() {
        if (!tryLock()){
            waitForLock();
            lock();
        }
    }

    private void waitForLock(){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        IZkDataListener listener = new IZkDataListener() {
            @Override
            public void handleDataChange(String s, Object o) throws Exception {
            }

            @Override
            public void handleDataDeleted(String s) throws Exception {
                System.out.println("节点被删除");
                countDownLatch.countDown();
            }
        };
        zkClient.subscribeDataChanges(lockPath , listener);
        if (this.zkClient.exists(lockPath)){ //如果锁节点存在，则去阻塞
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        zkClient.unsubscribeDataChanges(lockPath , listener);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        //如果当前线程的counts大于0 ，则进行锁的重入
        if (this.counts.get() != null){
            int count = this.counts.get();
            if (count > 0){
                this.counts.set(++count);
                return true;
            }
        }
        try {
            zkClient.createEphemeral(lockPath);
            this.counts.set(1);
        }catch (ZkNodeExistsException e){
            return false;
        }
        return true;
    }

    @Override
    public boolean tryLock(long time, @NotNull TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        //对于重入锁，要等到所有锁释放才可以删除节点
        if (this.counts.get() != null){
            int count = this.counts.get();
            if (count > 1){
                this.counts.set(--count);
                return;
            }else{
                this.counts.set(null);
            }
        }
        zkClient.delete(lockPath);
    }

    @NotNull
    @Override
    public Condition newCondition() {
        return null;
    }


    public static void main(String[] args) {
        int counts = 50;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(counts); //循环屏障
        for (int i = 0 ;i<50;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    ZkLock zkLock = new ZkLock("/pay-lock-1");
                    try{
                        zkLock.lock();
                        System.out.println(Thread.currentThread().getName() + " 获得锁！");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        zkLock.unlock();
                    }
                }
            }).start();
        }
    }
}
