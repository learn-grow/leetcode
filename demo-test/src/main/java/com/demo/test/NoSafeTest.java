package com.demo.test;

/**
 * @author: lisy
 * @version: : NoSafeTest , v0.1 2020年05月21日 2:11 下午
 * @remark: the NoSafeTest is
 */
public class NoSafeTest {

    public static void main(String[] args) {
        NotThreadSafe safe = new NotThreadSafe();
        /**
         * 因为对safe实例有共享，所以会存在竞态条件
         */
        new Thread(new MyRunnable(safe)).start();
        new Thread(new MyRunnable(safe)).start();

        /**
         * 不会产生竞态条件的
         */
        new Thread(new MyRunnable(new NotThreadSafe())).start();
        new Thread(new MyRunnable(new NotThreadSafe())).start();

    }

    public static class MyRunnable implements Runnable{
        NotThreadSafe safe = null;

        public MyRunnable(NotThreadSafe safe){
            this.safe = safe;
        }
        @Override
        public void run() {
            safe.add("some text");
        }
    }
}
