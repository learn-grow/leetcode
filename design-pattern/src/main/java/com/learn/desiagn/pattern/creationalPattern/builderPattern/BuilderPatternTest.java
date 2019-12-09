package com.learn.desiagn.pattern.creationalPattern.builderPattern;

import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.ColorEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.ComputerEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.service.factory.IBuilderDirecto;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.service.impl.AppleBuilder;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.service.factory.impl.ComputerDirectoImpl;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.service.impl.HuaWeiBuilder;

/**
 * @author : lisy
 * @version $Id: BuilderPatternTest, v 0.1 2019年12月09日 4:02 PM lisy Exp $
 * 生成器模式（Builder Pattern）创建者模式
 */
public class BuilderPatternTest {

    public static void main(String args[]) throws CloneNotSupportedException {

        AppleBuilder appleBuilder = new AppleBuilder();

        //apple
        IBuilderDirecto appleFactory = new ComputerDirectoImpl(appleBuilder);
        ComputerEntity appleComputer = appleFactory.createComputer();
        System.out.println(appleComputer.getBrand().getName());
        System.out.println(appleComputer.getColor().getName());
        System.out.println(appleComputer.getCpu().getName());


        //hua wei
        IBuilderDirecto huaWeiFactory = new ComputerDirectoImpl(new HuaWeiBuilder());
        ComputerEntity huaWeiComputer = huaWeiFactory.createComputer();
        System.out.println(huaWeiComputer.getBrand().getName());
        System.out.println(huaWeiComputer.getColor().getName());
        System.out.println(huaWeiComputer.getCpu().getName());

        ComputerEntity huaWei1Computer = (ComputerEntity)huaWeiComputer.clone();
        huaWei1Computer.setColor(new ColorEntity("黑色"));
        System.out.println(huaWei1Computer.getBrand().getName());
        System.out.println(huaWei1Computer.getColor().getName());
        System.out.println(huaWei1Computer.getCpu().getName());

    }
}
