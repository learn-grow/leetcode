package com.demo.one.xiaohui;

import java.util.Arrays;

/**
 * @author: lisy
 * @version: : DemoQueue , v0.1 2020年06月14日 10:54 下午
 * @remark: the DemoQueue is
 */
public class DemoQueue {

    private int[] arrays;

    /**
     * 队头
     */
    private int front;

    /**
     * 队尾
     */
    private int rear;

    public DemoQueue(int capacity){
        this.arrays = new int[capacity];
    }

    /**
     * 入队
     * @param e
     * @throws Exception
     */
    public void enQueue(int e) throws Exception {
        if ((rear + 1) % arrays.length == front) {
            throw new Exception("queue 已满");
        }

        arrays[rear] = e;
        rear = (rear + 1) % arrays.length;
    }

    public int deQueue() throws Exception{
        if (rear == front){
            throw new Exception("当前队列为空.");
        }

        int e = arrays[front];
        front = (front + 1) % arrays.length;
        return e;
    }

    public void print(){
        for (int array : arrays) {
            System.out.println(array);
        }
    }

}
