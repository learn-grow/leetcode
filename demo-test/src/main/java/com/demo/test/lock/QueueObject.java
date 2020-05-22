package com.demo.test.lock;

/**
 * @author: lisy
 * @version: : QueueObject , v0.1 2020年05月22日 2:33 下午
 * @remark: the QueueObject is
 */
public class QueueObject {

    private boolean isNotified = false;

    public synchronized void  doWait() throws InterruptedException {
        while (!isNotified){
            this.wait();
        }
        this.isNotified = false;
    }

    public synchronized void doNotify(){
        this.isNotified = true;
        this.notify();
    }

    public boolean equals(Object o){
        return this == o;
    }
}
