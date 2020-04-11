package com.learn.leetcode;

/**
 * @author: lisy
 * @version: : StackOverFlow , v0.1 2020年04月11日 3:30 下午
 * @remark: the StackOverFlow is 虚拟机栈溢出
 */
public class StackOverFlow {

    private static int index = 1;

    public void call() {
        index++;
        call();
    }

    public static void main(String[] args) {
        try {
            StackOverFlow stackOverFlow = new StackOverFlow();
            stackOverFlow.call();
        }catch (Throwable e){
            System.out.println("stack deep :" + index);
            e.printStackTrace();
        }
    }
}
