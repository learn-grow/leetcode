package com.demo.test;

/**
 * @author: lisy
 * @version: : Counter , v0.1 2020年05月21日 1:44 下午
 * @remark: the Counter is
 */
public class Counter {

    protected long count = 0;

    public void add(long value){
        this.count = count + value;
    }
}
