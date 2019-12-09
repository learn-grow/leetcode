package com.learn.desiagn.pattern.creationalPattern.singletonPattern;

/**
 * @author : lisy
 * @version $Id: SingletonPattern, v 0.1 2019年12月09日 3:44 PM lisy Exp $
 * 线程安全的单列模式
 */
public class SingletonPattern1 {

    private static SingletonPattern1 singleton;

    private SingletonPattern1() {
        System.out.println("create object!");
    }

    /**
     * 线程安全
     * @return
     */
    public synchronized static SingletonPattern1 getSingleton() {
        if (singleton == null)
            singleton = new SingletonPattern1();

        return singleton;
    }
}
