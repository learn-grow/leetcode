package com.demo.test.sianal;

/**
 * @author: lisy
 * @version: : MySignal , v0.1 2020年05月21日 3:43 下午
 * @remark: the MySignal is 通过共享对象通信
 */
public class MySignal {

    protected boolean hasDataToProcess = false;

    public synchronized boolean hasDataToProcess(){
        return this.hasDataToProcess;
    }

    public synchronized void setHasDataToProcess(boolean hasData){
        this.hasDataToProcess = hasData;
    }
}
