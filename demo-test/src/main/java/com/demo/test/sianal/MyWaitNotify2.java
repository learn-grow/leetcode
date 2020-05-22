package com.demo.test.sianal;

/**
 * @author: lisy
 * @version: : MyWaitNotify , v0.1 2020年05月21日 3:57 下午
 * @remark: the MyWaitNotify is 防止信号丢失的wait  与 notify/notifyall
 */
public class MyWaitNotify2 {

    MonitorObject monitorObject = new MonitorObject();
    boolean wasSignalled = false; //存储是否被通知

    public void doWait(){
        synchronized (monitorObject){
            if (!wasSignalled){
                try {
                    monitorObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            wasSignalled = false;
        }
    }

    public void doNotify(){
        synchronized (monitorObject){
            wasSignalled = true;
            monitorObject.notify();
        }
    }
}
