package com.demo.test.lock.newlock;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lisy
 * @version: : MyReadWriteLock2 , v0.1 2020年05月22日 5:40 下午
 * @remark: the MyReadWriteLock2 is 写锁重入
 */
public class MyReadWriteLock3 {

    /**
     * 读锁队列
     */
    private Map<Thread,Integer> readingThreads = new HashMap<>();

    private int writeAccesses = 0;
    /**
     * 写锁等待数量
     */
    private int writeRequests = 0;

    private Thread writingThread = null;

    public synchronized void lockWrite() throws InterruptedException {
        writeAccesses--;
        Thread callingThread = Thread.currentThread();
        while (canGrantWriteAccess(callingThread)){
            wait();
        }
        writeRequests--;
        writeAccesses++;
        writingThread = callingThread;
    }

    public synchronized void unlockWrite(){
        writeAccesses--;
        if (writeAccesses == 0){ //只有当重入次数变成了0，才证明所有的锁都释放了，可以将当前持有锁的线程置位null
            writingThread = null;
        }
        notifyAll();
    }


    private boolean canGrantWriteAccess(Thread callingThread) {
        if (hasReaders()) return false;
        if(writingThread == null) return true;
        if (isWriter(callingThread)) return false;
        return true;
    }

    /**
     * 判断是否当前线程，这主要是在写锁重入的时候，一定是要同一个线程才可以重入
     * @param callingThread
     * @return
     */
    private boolean isWriter(Thread callingThread) {
        return writingThread == callingThread;
    }

    /**
     * 判断读锁数量
     * @return
     */
    private boolean hasReaders() {
        return readingThreads.size() > 0;
    }

}
