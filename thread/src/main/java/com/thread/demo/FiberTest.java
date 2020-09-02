package com.thread.demo;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.strands.SuspendableRunnable;

import java.util.concurrent.ExecutionException;

/**
 * @author: lisy
 * @version: : Fiber , v0.1 2020年08月20日 2:08 下午
 * @remark: the Fiber is
 */
public class FiberTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long satrtTime = System.currentTimeMillis();

        int size = 100000;
        Fiber<Void>[] fibers = new Fiber[size];
        for (int i = 0 ; i < size ; ++i){
            fibers[i] = new Fiber<>(new SuspendableRunnable() {
                @Override
                public void run() throws SuspendExecution, InterruptedException {
                    calc();
                }
            });
        }

        Thread[] threads = new Thread[size];
        for (int i = 0 ; i < 10 ;++i){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0 ; i < fibers.length ; ++i){
                        try {
                            fibers[i].start();
                            fibers[i].join();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - satrtTime);

    }

    private static void calc() {
        int result = 0;
        for (int m = 0; m < 10000; m++) {
            for (int i = 0; i < 200; i++) result += i;
        }
    }
}
