package com.learn.desiagn.pattern.creationalPattern.singletonPattern;

/**
 * @author : lisy
 * @version $Id: SingletonPattern, v 0.1 2019年12月09日 3:44 PM lisy Exp $
 * 非线程安全的单列模式
 */
public class SingletonPattern {

    private static SingletonPattern singleton;

    private SingletonPattern() {
        System.out.println("create object!");
    }

    /**
     * 非线程安全
     * @return
     */
    public static SingletonPattern getSingleton() {
        if (singleton == null)
            singleton = new SingletonPattern();

        return singleton;
    }
}
