package com.learn.desiagn.pattern.creationalPattern.prototypePattern;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.entity.Sheep1;
import com.learn.desiagn.pattern.creationalPattern.prototypePattern.entity.Sheep2;

import java.util.Date;

/**
 * @author : lisy
 * @version $Id: PrototypePatternTest, v 0.1 2019年12月09日 7:18 PM lisy Exp $
 */
public class PrototypePatternTest2 {


    /**
     * 深复制
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String args[]) throws CloneNotSupportedException {
        Date date = new Date(121212);

        Sheep2 sheep1 = new Sheep2("绵羊", "灰色",date);
        Sheep2 sheep2 = (Sheep2) sheep1.clone();

        System.out.println("sheep1 name :" + sheep1.getName() + ",color :" + sheep1.getColor() + ",date :" + sheep1.getDate());

        date.setTime(56789456);


        System.out.println("sheep1 name :" + sheep1.getName() + ",color :" + sheep1.getColor() + ",date :" + sheep1.getDate());

        System.out.println("sheep2 name :" + sheep2.getName() + ",color :" + sheep2.getColor()+ ",date :" + sheep2.getDate());
    }
}
