package com.demo.test.synchronize;

/**
 * @author: lisy
 * @version: : Example , v0.1 2020年05月21日 3:36 下午
 * @remark: the Example is
 */
public class Example {

    public static void main(String[] args) {
        Conuter conuter = new Conuter();
        Thread threadA = new CounterThread(conuter);
        Thread threadB = new CounterThread(conuter);
        threadA.start();
        threadB.start();

        System.out.println(conuter.getCount());

//        System.out.println(conuter.count);
    }
}
