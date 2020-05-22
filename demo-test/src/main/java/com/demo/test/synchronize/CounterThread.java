package com.demo.test.synchronize;

/**
 * @author: lisy
 * @version: : ConterThread , v0.1 2020年05月21日 3:34 下午
 * @remark: the ConterThread is
 */
public class CounterThread extends Thread {

    protected Conuter conuter = null;

    public CounterThread(Conuter conuter){
        this.conuter = conuter;
    }

    @Override
    public void run() {
        for (int i = 0;i < 10 ;i++){
            System.out.println("++");
            conuter.add(i);
        }
    }
}
