package com.demo.test.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: lisy
 * @version: : LockTest , v0.1 2020年05月22日 2:23 下午
 * @remark: the LockTest is
 */
public class LockTest {

    Lock lock = new ReentrantLock();

    public void doSyncronized(){
        this.lock.lock(); //get the lock
        System.out.println("this thread get lock");
        this.lock.unlock(); //
    }
}
