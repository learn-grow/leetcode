package com.learn.leetcode.statictest;

/**
 * @author: lisy
 * @version: : StaticTest , v0.1 2020年05月08日 5:38 下午
 * @remark: the StaticTest is
 */
public class StaticTest {

    public static String staticField = "静态变量";

    public String filed = "非静态变量";

    /**
     * 静态代码块
     */
    static {
        System.out.println(staticField);
        System.out.println("静态代码块初始化");
    }
    {
        System.out.println(filed);
        System.out.println("初始化块");
    }
    public StaticTest(){
        System.out.println("构造函数");
    }

    public static void main(String[] args) {
        new StaticTest();
    }
}
