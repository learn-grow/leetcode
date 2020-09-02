package com.dis.lock.zk;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.exception.ZkNodeExistsException;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author: lisy
 * @version: : ZkLock , v0.1 2020年06月07日 6:57 下午
 * @remark: the ZkLock is zk 分布式锁 创建顺序节点，防止惊群响应
 */
public class ZkLock2 implements Lock {

    /**
     * 利用临时顺序节点实现分布式锁
     * 获取锁，创建自己的临时顺序节点，然后判断自己是否最小号，如果是，则获取锁，不是，则去注册前一节点的watcher，阻塞等待
     * 释放锁，删除自己创建的临时顺序节点
     */
    private String lockPath;

    private ZkClient zkClient;

    private ThreadLocal<String> currentPath = new ThreadLocal<>();
    private ThreadLocal<String> beforePath = new ThreadLocal<>();
    private ThreadLocal<Integer> counts = new ThreadLocal<>();


    public ZkLock2(String lockPath){
        super();
        this.lockPath = lockPath;
        zkClient = new ZkClient("127.0.0.1:2181");
        zkClient.setZkSerializer(new MyZkSerializer());
        if (!this.zkClient.exists(lockPath)){
            try {
                this.zkClient.createPersistent(lockPath);
                System.out.println("创建成功");
            }catch (ZkNodeExistsException e){
            }
        }
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
        //去向前序节点注册watcher事件
        zkClient.subscribeDataChanges(this.beforePath.get() , listener);
        if (this.zkClient.exists(this.beforePath.get())){ //如果锁节点存在，则去阻塞
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        zkClient.unsubscribeDataChanges(this.beforePath.get() , listener);
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
        if (this.currentPath.get() == null){
            currentPath.set(this.zkClient.createEphemeralSequential(lockPath + "/" ,"lock"));
        }
        List<String> childrens = this.zkClient.getChildren(lockPath);
        Collections.sort(childrens);
        if (currentPath.get().equals(lockPath + "/" + childrens.get(0))){
            this.counts.set(1);
            return true;
        }else{
            //获取前一个节点
            int curIndex = childrens.indexOf(currentPath.get().substring(lockPath.length() + 1));
            beforePath.set(lockPath + "/" + childrens.get(curIndex - 1));
        }
        return false;
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
        this.zkClient.delete(this.currentPath.get());
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
                    ZkLock2 zkLock = new ZkLock2("/dis-lock");
                    try{
                        zkLock.lock();
                        System.out.println(Thread.currentThread().getName() + " 获得锁！");
                    } finally {
                        zkLock.unlock();
                    }
                }
            }).start();
        }
    }
}
