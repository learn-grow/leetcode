package com.lock.demo.java;

/**
 * @author: lisy
 * @version: : ThreadB , v0.1 2020年04月22日 6:07 下午
 * @remark: the ThreadB is
 */
public class ThreadB extends Thread {

    int i;

    public ThreadB(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("this is b:" + i);
    }
}
