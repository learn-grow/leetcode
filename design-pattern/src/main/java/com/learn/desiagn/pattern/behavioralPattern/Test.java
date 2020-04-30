package com.learn.desiagn.pattern.behavioralPattern;

/**
 * @author: lisy
 * @version: : Test , v0.1 2020年04月22日 4:21 下午
 * @remark: the Test is
 */
public class Test {


    public int a(int i){
        System.out.println("int i");
        return i;
    }

    public String a(String i){
        System.out.println("String i");
        return i + "";
    }

    public Integer a(Integer i){
        System.out.println("Integer i");
        return i;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.a(new Integer(1).intValue());

    }
}
