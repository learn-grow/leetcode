package com.learn.desiagn.pattern.creationalPattern.singletonPattern;

/**
 * @author : lisy
 * @version $Id: SingletonPattern, v 0.1 2019年12月09日 3:44 PM lisy Exp $
 *
 */
public class SingletonPattern0 {

    private static SingletonPattern0 singleton  = new SingletonPattern0();

    private SingletonPattern0() {
        System.out.println("create object!");
    }

    /**
     * 饿汉
     * @return
     */
    public static SingletonPattern0 getSingleton() {
        return singleton;
    }
}
