package com.learn.desiagn.pattern.behavioralPattern.iterator;

/**
 * @author: lisy
 * @version: : Resource , v0.1 2020年05月18日 7:28 下午
 * @remark: the Resource is
 */
public class Resource implements AutoCloseable {

    public void read(){
        System.out.println("read line");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close the read");
    }
}
