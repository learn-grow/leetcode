package com.learn.desiagn.pattern.creationalPattern.factorymethod;

import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.IFactory;
import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.impl.AppleFactoryImpl;
import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.impl.HuaWeiFactoryImpl;

/**
 * @author : lisy
 * @version $Id: FactoryMethodTest, v 0.1 2019年12月09日 2:52 PM lisy Exp $
 * 工厂方法
 */
public class FactoryMethodTest {

    public static void main(String args[]){
        IFactory factory;

        factory = new HuaWeiFactoryImpl();
        factory.createFactory().create();

        factory = new AppleFactoryImpl();
        factory.createFactory().create();
    }
}
