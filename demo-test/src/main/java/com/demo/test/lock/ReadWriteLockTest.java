package com.demo.test.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: lisy
 * @version: : ReadWriteLockTest , v0.1 2020年05月22日 6:31 下午
 * @remark: the ReadWriteLockTest is
 */
public class ReadWriteLockTest {

    public static void main(String[] args) {

        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


        lock.readLock().lock();

        lock.readLock().unlock();


        lock.writeLock().lock();
        lock.writeLock().unlock();
    }
}
