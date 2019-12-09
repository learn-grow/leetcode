package com.learn.desiagn.pattern.creationalPattern.simplefactory;

/**
 * @author : lisy
 * @version $Id: SimpleFactoryTest, v 0.1 2019年12月09日 2:18 PM lisy Exp $
 * 简单工厂
 */
public class SimpleFactoryTest {

    public static void main(String args[]) throws Exception {
        Factory factory = new Factory();
        factory.product("Apple").run();
        factory.product("HuaWei").run();
    }
}
