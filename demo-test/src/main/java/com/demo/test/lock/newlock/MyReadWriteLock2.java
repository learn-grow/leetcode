package com.demo.test.lock.newlock;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lisy
 * @version: : MyReadWriteLock2 , v0.1 2020年05月22日 5:40 下午
 * @remark: the MyReadWriteLock2 is 读锁重入
 */
public class MyReadWriteLock2 {

    /**
     * 读锁队列
     */
    private Map<Thread,Integer> readingThreads = new HashMap<>();

    /**
     * 写锁重入次数 可理解为标示
     */
    private int writers = 0;
    /**
     * 写锁等待数量
     */
    private int writeRequests = 0;

    /**
     * 获取读锁
     * @throws InterruptedException
     */
    public synchronized void lockRead() throws InterruptedException {
        Thread callingThread = Thread.currentThread();
        while (!canGrantReadAccess(callingThread)){
            wait();
        }
        readingThreads.put(callingThread , getAccessCount(callingThread) + 1);
    }

    /**
     * 释放读锁
     */
    public synchronized void unlockRead(){
        Thread callingThread = Thread.currentThread();
        int accessCount = getAccessCount(callingThread);
        if (accessCount == 1){
            readingThreads.remove(callingThread);
        }else{
            readingThreads.put(callingThread , (accessCount - 1));
        }
        notifyAll();
    }


    /**
     * 获取当前锁的重入次数
     * @param callingThread
     * @return
     */
    private Integer getAccessCount(Thread callingThread) {
        Integer accessCount = readingThreads.get(callingThread);
        if (accessCount == null) return 0;
        return accessCount.intValue();
    }

    /**
     *
     * @param callingThread
     * @return
     */
    private boolean canGrantReadAccess(Thread callingThread){
        if (writers > 0) return false;
        if (isReader(callingThread)) return true;
        if (writeRequests > 0) return false;
        return true;
    }

    /**
     * 判断当前线程是否在读锁队列中
     * @param callingThread
     * @return
     */
    private boolean isReader(Thread callingThread){
        return readingThreads.get(callingThread) != null;
    }

}
