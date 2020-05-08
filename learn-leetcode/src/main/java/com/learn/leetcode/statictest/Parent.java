package com.learn.leetcode.statictest;

/**
 * @author: lisy
 * @version: : Parent , v0.1 2020年05月08日 5:41 下午
 * @remark: the Parent is
 */
public class Parent {

    public static String _pFiled = "父类静态变量";
    protected int i = 1;
    protected int j = 8;
    public String pFiled = "父类非静态变量";

    static {
        System.out.println(_pFiled);
        System.out.println("父类静态初始化代码块");
    }
    {
        System.out.println(pFiled);
        System.out.println("父类初始化块");
    }

    public Parent(){
        System.out.println("父类构造函数");
    }

}
