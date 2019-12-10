package com.learn.desiagn.pattern.structuralPattern.decoratorPattern;

import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.Component;
import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.impl.ComponentImpl;
import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.impl.DecoratorImpl;

/**
 * @author : lisy
 * @version $Id: DecoratorPatternTest, v 0.1 2019年12月10日 6:40 PM lisy Exp $
 */
public class DecoratorPatternTest {

    public static void main(String args[]){
        Component component = new ComponentImpl();

        component.operation();

        System.out.println("------------------");
        Component component1 = new DecoratorImpl(component);

        component1.operation();
    }
}
