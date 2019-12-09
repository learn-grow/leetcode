package com.learn.desiagn.pattern.creationalPattern.singletonPattern;

/**
 * @author : lisy
 * @version $Id: SingletonPatternTest, v 0.1 2019年12月09日 3:42 PM lisy Exp $
 * 单列模式
 */
public class SingletonPatternTest {

    public static void main(String args[]){

        SingletonPattern singletonPattern = SingletonPattern.getSingleton();

        singletonPattern.getSingleton();

    }
}
