package com.learn.leetcode.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;

/**
 * @author: lisy
 * @version: : CountDownTest , v0.1 2020年05月09日 11:18 上午
 * @remark: the CountDownTest is
 */
public class CountDownTest {


    public static void main(String[] args) throws InterruptedException {
        CountDownLatch downLatch = new CountDownLatch(5);

        for (int i = 0 ;i < 7 ;i++){
            new Thread(new A(i,downLatch)).start();
        }
        downLatch.await();
        System.out.println("zhixing");
    }


    static class A implements Runnable{

        int i;
        CountDownLatch downLatch;

        public A(int i,CountDownLatch downLatch){
            this.downLatch = downLatch;
            this.i = i;
        }



        @Override
        public void run() {
            try {
                Thread.sleep(i*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                downLatch.countDown();
            }
            System.out.println("这是第:" + i + " 把锁");
        }
    }
}
