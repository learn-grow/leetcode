package com.demo.test.synchronize;

/**
 * @author: lisy
 * @version: : SyncTest , v0.1 2020年05月21日 3:04 下午
 * @remark: the SyncTest is
 */
public class SyncTest {

    static int count = 0;

    /**
     * 实例方法同步 ，这种方式告诉我们，这个方法是同步的，
     * @param v
     */
    public synchronized void add(int v){
        this.count = count + v;
    }

    /**
     * 静态方法同步 ，方法是同步的 作用域为该方法所属的类对象上
     * @param v
     */
    public static synchronized void staticAdd(int v){
        count += v;
    }

    /**
     * 实例方法同步块 与同步方法的的效果一样 ，如果使用this，即为该方法的实例本身
     * @param v
     */
    public void addNew(int v){
        synchronized (this){
            count += v;
        }
    }
}
