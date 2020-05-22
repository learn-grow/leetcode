package com.demo.test;

/**
 * @author: lisy
 * @version: : MyThread , v0.1 2020年05月21日 11:29 上午
 * @remark: the MyThread is
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("this is thread impl running");
    }
}
