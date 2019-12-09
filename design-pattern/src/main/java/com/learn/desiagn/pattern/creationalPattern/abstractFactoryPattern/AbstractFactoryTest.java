package com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern;

import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.IFactory;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.factory.AppleGoldenFactory;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.factory.HuaWeiBlackFactory;

/**
 * @author : lisy
 * @version $Id: AbstractFactoryTest, v 0.1 2019年12月09日 3:22 PM lisy Exp $
 * 抽象工厂
 */
public class AbstractFactoryTest {


    public static void main(String args[]){
        IFactory appleFactory = new AppleGoldenFactory();
        appleFactory.create().create();
        appleFactory.add().add();

        System.out.println();
        IFactory huaweiFactory = new HuaWeiBlackFactory();
        huaweiFactory.create().create();
        huaweiFactory.add().add();

    }
}
