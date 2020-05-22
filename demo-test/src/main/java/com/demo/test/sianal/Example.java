package com.demo.test.sianal;

/**
 * @author: lisy
 * @version: : Example , v0.1 2020年05月21日 3:46 下午
 * @remark: the Example is demo
 */
public class Example {

    public static void main(String[] args) {
        MySignal signal = new MySignal();
        new Thread(new MySignalRunnable(signal)).start();
        new Thread(new MySignalRunnableB(signal)).start();
    }

    public static class MySignalRunnable implements Runnable{

        MySignal signal = null;
        public MySignalRunnable(MySignal signal){
            this.signal = signal;
        }

        @Override
        public void run() {
            for (int i = 0;i<10;i++){
                System.out.println("执行10次以后就修改共享变量的值");
            }
            signal.setHasDataToProcess(true);
            System.out.println("修改共享变量成功");
        }
    }

    public static class MySignalRunnableB implements Runnable{
        MySignal signal = null;
        public MySignalRunnableB(MySignal signal){
            this.signal = signal;
        }
        @Override
        public void run() {
            if (signal.hasDataToProcess){
                System.out.println("获取到共享变量,开始执行对应的任务");
            }
        }
    }
}
