package com.demo.test.lock.newlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: lisy
 * @version: : Counter , v0.1 2020年05月22日 5:20 下午
 * @remark: the Counter is 简单的锁实现，利用synchronized
 */
public class Counter {

    private int count = 0;

    /**
     * synchronized的实现
     * @return
     */
    public int incSync(){
        synchronized (this){
            return ++count;
        }
    }

    /**
     * lock 的实现
     */
    public Lock lock = new ReentrantLock();
    public int icrLock(){
        lock.lock();
        int newCount = ++count;
        lock.unlock(); //使用lock的时候一定要手动释放锁，防止死锁
        return newCount;
    }


    /**
     * 自己实现的一个简单的锁
     */
    public class MyLock{
        private boolean isLocked = false;

        public synchronized void lock() throws InterruptedException {
            while (isLocked){ //自旋锁
                wait();
            }
            isLocked = true;
        }

        public synchronized void unlock(){
            isLocked = false;
            notify();
        }
    }


}
