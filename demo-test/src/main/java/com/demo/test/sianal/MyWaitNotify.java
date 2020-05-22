package com.demo.test.sianal;

/**
 * @author: lisy
 * @version: : MyWaitNotify , v0.1 2020年05月21日 3:57 下午
 * @remark: the MyWaitNotify is wait  与 notify/notifyall
 */
public class MyWaitNotify {

    MonitorObject monitorObject = new MonitorObject();

    public void doWait(){
        synchronized (monitorObject){
            try {
                monitorObject.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doNotify(){
        synchronized (monitorObject){
            monitorObject.notify();
        }
    }
}
