package com.demo.test;

/**
 * @author: lisy
 * @version: : NotThreadSafe , v0.1 2020年05月21日 1:59 下午
 * @remark: the NotThreadSafe is
 */
public class NotThreadSafe {

    StringBuilder builder = new StringBuilder();

    public void add(String text){
        this.builder.append(text);
    }
}
