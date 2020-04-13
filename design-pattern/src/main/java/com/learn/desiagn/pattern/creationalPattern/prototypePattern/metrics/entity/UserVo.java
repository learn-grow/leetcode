package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity;

/**
 * @author: lisy
 * @version: : UserVo , v0.1 2020年04月13日 10:50 上午
 * @remark: the UserVo is
 */
public class UserVo {

    private String name;

    private String password;

    private int age;

    public UserVo(){}

    public UserVo(String name,String password ,int age){
        this.name = name;
        this.password = password;
        this.age = age;
    }
}
