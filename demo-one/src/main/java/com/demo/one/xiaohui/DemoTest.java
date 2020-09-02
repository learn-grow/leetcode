package com.demo.one.xiaohui;

/**
 * @author: lisy
 * @version: : DemoTest , v0.1 2020年06月14日 11:01 下午
 * @remark: the DemoTest is
 */
public class DemoTest {

    public static void main(String[] args) throws Exception {
        DemoQueue queue = new DemoQueue(6);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(5);
        queue.print();
    }
}
