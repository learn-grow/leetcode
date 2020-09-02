package com.demo.one.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @author: lisy
 * @version: : JDKDemo , v0.1 2020年06月12日 5:21 下午
 * @remark: the JDKDemo is
 */
public class JDKDemo {

    public static void main(String[] args) {
        printList();
    }

    /**
     * Lambda 表达式
     */
    public static void printList(){
        List<Integer> list = Arrays.asList(5,1,3,4,5);
        /**
         * 排序
         */
        list.sort((e1 ,e2) ->e1.compareTo(e2));

        /**
         * 遍历
         */
        list.forEach(e-> System.out.println(e));
        Arrays.asList(1,2,3,4,5).forEach( e -> {
            if (e == 1){
                System.out.println("this is 1");
            }
        });

        System.out.println(5%8);
    }
}
