package com.learn.desiagn.pattern.structuralPattern.flyweightPattern;

import com.learn.desiagn.pattern.structuralPattern.flyweightPattern.service.IFlyweight;
import com.learn.desiagn.pattern.structuralPattern.flyweightPattern.service.impl.FlyweightFactory;

/**
 * @author : lisy
 * @version $Id: FlyweghtPatternTest, v 0.1 2019年12月11日 11:02 AM lisy Exp $
 * client
 */
public class FlyweightPatternTest {

    public static void main(String args[]){

        IFlyweight f1 = FlyweightFactory.getFlyweight("a");
        IFlyweight f2 = FlyweightFactory.getFlyweight("b");
        f1.operation("a");
        f2.operation("b");
    }
}
