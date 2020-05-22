package com.demo.test.threadlocal;

/**
 * @author: lisy
 * @version: : ThreadLocalExample , v0.1 2020年05月21日 4:14 下午
 * @remark: the ThreadLocalExample is
 */
public class ThreadLocalExample {

    private static InheritableThreadLocal<Integer> integerInheritableThreadLocal = new InheritableThreadLocal<>();
    public static class MyRunnable implements Runnable{
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();


        @Override
        public void run() {
            threadLocal.set((int) (Math.random() * 100d));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("integerInheritableThreadLocal :" + integerInheritableThreadLocal.get());


            System.out.println(threadLocal.get());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        integerInheritableThreadLocal.set(1);
        MyRunnable sharedRunnableInstance = new MyRunnable();
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);
        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread1 to terminate
        thread2.join(); //wait for thread2 to terminate
    }
}
