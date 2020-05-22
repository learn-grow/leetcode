package com.demo.test.threadlocal;

/**
 * @author: lisy
 * @version: : ThreadLocalTest , v0.1 2020年05月21日 4:08 下午
 * @remark: the ThreadLocalTest is
 */
public class ThreadLocalTest {

    private static ThreadLocal myThreadLocal = new ThreadLocal();

    private static ThreadLocal<String> myThradLocal1 = new ThreadLocal<String>();

    /**
     * 实现一个所有线程都可见的threadLocal
     */
    private ThreadLocal myThreadLocal2 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "this is the initial value";
        }
    };

    public static void main(String[] args) {
        myThreadLocal.set("a thread local value");
        myThradLocal1.set("b thread local value");
        String threadLocalValue = (String) myThreadLocal.get();
        String thradLocalValue2 = myThradLocal1.get();
        System.out.println(threadLocalValue);
        System.out.println(thradLocalValue2);
    }
}
