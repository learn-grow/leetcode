package com.lock.demo.java;

/**
 * @author: lisy
 * @version: : ThreadA , v0.1 2020年04月22日 6:06 下午
 * @remark: the ThreadA is
 */
public class ThreadA extends Thread {

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("this is a");

    }

}
