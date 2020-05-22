package com.demo.test.lock;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : FairLock , v0.1 2020年05月22日 2:32 下午
 * @remark: the FairLock is 公平锁的实现
 */
public class FairLock {

    private boolean isLocked = false;
    private Thread lockingThread = null;
    private List<QueueObject> waitingThreads = new ArrayList<QueueObject>();

    public void lock() throws InterruptedException {
        QueueObject queueObject = new QueueObject();
        boolean isLockedForThisThread = true;
        synchronized (this){
            waitingThreads.add(queueObject);
        }
        while (isLockedForThisThread){
            synchronized (this){
                isLockedForThisThread = isLocked || waitingThreads.get(0) != queueObject;
                if (!isLockedForThisThread){
                    waitingThreads.remove(queueObject);
                    lockingThread = Thread.currentThread();
                    return;
                }
            }
            try {
                queueObject.wait();
            } catch (InterruptedException e) {
                synchronized (this){
                    waitingThreads.remove(queueObject);
                }
                throw e;
            }
        }
    }

    public synchronized void unlock(){
        if (this.lockingThread != Thread.currentThread()){
            throw new IllegalMonitorStateException("calling thread has not locked this lock");
        }
        isLocked = false;
        lockingThread = null;
        if (waitingThreads.size() > 0){
            waitingThreads.get(0).doNotify();
        }
    }



}
