package com.demo.test.synchronize;

/**
 * @author: lisy
 * @version: : Counter , v0.1 2020年05月21日 3:33 下午
 * @remark: the Counter is
 */
public class Conuter {

    long count = 0;
    public synchronized void add(long v){
        this.count += v;
    }

    public long getCount(){
        return count;
    }

}
