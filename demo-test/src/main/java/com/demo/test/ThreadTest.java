package com.demo.test;

/**
 * @author: lisy
 * @version: : ThreadTest , v0.1 2020年05月20日 10:10 上午
 * @remark: the ThreadTest is
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("this running ~");
            }
        };
        t1.start();


        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable running");
            }
        };
        Thread t3 = new Thread(runnable);
        t3.start();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
                String name = Thread.currentThread().getName();
                System.out.println(name);
            }
        };
        Thread t4 = new Thread(runnable1 , "threadName");
        t4.start();
        System.out.println(t4.getName());


        for (int i = 0 ;i < 10 ; i++){
            new Thread("" + i){
                @Override
                public void run() {
                    System.out.println("thread name "+getName());
                }
            }.start();
        }

    }
}
