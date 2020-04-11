package com.learn.leetcode;

import java.util.Stack;

/**
 * @author: lisy
 * @version: : StackQueue , v0.1 2020年04月11日 11:26 上午
 * @remark: the StackQueue is 两个栈实现队列
 */
public class StackQueue {

    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();

    public void push(int node){
        pushStack.push(node);
    }

    public int pop(){
        if (popStack.isEmpty()){
            while (!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
        if (popStack.isEmpty()) return -1;
        else return popStack.pop();
    }
}
