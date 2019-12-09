package com.learn.desiagn.pattern.creationalPattern.prototypePattern;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.entity.Sheep1;

/**
 * @author : lisy
 * @version $Id: PrototypePatternTest, v 0.1 2019年12月09日 7:18 PM lisy Exp $
 */
public class PrototypePatternTest1 {


    /**
     * 浅复制
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String args[]) throws CloneNotSupportedException {
        Sheep1 sheep1 = new Sheep1("绵羊", "灰色");

        Sheep1 sheep2 = (Sheep1) sheep1.clone();
        sheep2.setColor("白色");

        System.out.println("sheep1 name :" + sheep1.getName() + ",color :" + sheep1.getColor());
        System.out.println("sheep2 name :" + sheep2.getName() + ",color :" + sheep2.getColor());
    }
}
