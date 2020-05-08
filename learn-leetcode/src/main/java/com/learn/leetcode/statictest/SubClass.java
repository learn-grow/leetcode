package com.learn.leetcode.statictest;

/**
 * @author: lisy
 * @version: : SubClass , v0.1 2020年05月08日 5:45 下午
 * @remark: the SubClass is
 */
public class SubClass extends Parent {

    public final String finalStr = "final";
    public static String _sFiled = "子类静态变量";

    public String sFiled = "子类变量";

    static {

        System.out.println(_sFiled);
        System.out.println("子类静态初始化块");
    }

    {
        System.out.println(finalStr);
        System.out.println(sFiled);
        System.out.println("子类初始化块");
    }

    public SubClass(){
        System.out.println("子类构造函数");
    }

    public static void main(String[] args) {
        new SubClass();
    }
}
