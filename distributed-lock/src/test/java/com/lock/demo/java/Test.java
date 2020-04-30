package com.lock.demo.java;

/**
 * @author: lisy
 * @version: : Test , v0.1 2020年04月22日 6:07 下午
 * @remark: the Test is
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        ThreadA threadA = new ThreadA();
        ThreadB threadb1 = new ThreadB(1);
        ThreadB threadb2 = new ThreadB(2);

        threadb2.start();
        threadb1.start();
        threadA.start();



        threadA.join(1);

        System.out.println("执行完成");
    }
}
