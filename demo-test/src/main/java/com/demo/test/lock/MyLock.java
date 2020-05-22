package com.demo.test.lock;

/**
 * @author: lisy
 * @version: : MyLock , v0.1 2020年05月22日 2:26 下午
 * @remark: the MyLock is
 */
public class MyLock {

    private boolean islocked = false;

    private Thread lockingThread = null;

    public synchronized void lock() throws InterruptedException{
        while (islocked){
            wait();
        }
        islocked = true;
        lockingThread = Thread.currentThread();
    }

    public synchronized void unlock(){
        if (this.lockingThread != Thread.currentThread()){
            throw new IllegalMonitorStateException("calling thread has not locked this lock");
        }
        islocked = false;
        lockingThread = null;
        notify();
    }

}
