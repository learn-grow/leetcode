package com.demo.test.lock.newlock;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lisy
 * @version: : MyReadWriteLock2 , v0.1 2020年05月22日 5:40 下午
 * @remark: the MyReadWriteLock2 is 读锁升级到写锁
 */
public class MyReadWriteLock4 {

    /**
     * 读锁队列
     */
    private Map<Thread,Integer> readingThreads = new HashMap<>();
    private int writers = 0;
    private int writeRequest = 0;

    public synchronized void lockRead() throws InterruptedException {
        Thread callingThread = Thread.currentThread();
        while (!canGrantReadAccess(callingThread)){
            wait();
        }
        readingThreads.put(callingThread , getAccessCount(callingThread) + 1);
    }

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

    private Integer getAccessCount(Thread callingThread) {
        Integer accessCount = readingThreads.get(callingThread);
        if (accessCount == null) return 0;
        return accessCount.intValue();
    }

    /**
     * 判断是否可重入
     * @param callingThread
     * @return
     */
    private boolean canGrantReadAccess(Thread callingThread) {
        if (writers > 0) return false;
        if (isReader(callingThread)) return true;
        if (writeRequest > 0) return false;
        return true;
    }

    private boolean isReader(Thread callingThread) {
        return readingThreads.get(callingThread) != null;
    }

}
