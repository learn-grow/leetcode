package com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.impl;

import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.Component;
import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.Decorator;

/**
 * @author : lisy
 * @version $Id: DecoratorImpl, v 0.1 2019年12月10日 6:45 PM lisy Exp $
 */
public class DecoratorImpl extends Decorator {


    public DecoratorImpl(Component component) {
        super(component);
    }

    public void operation(){
        super.operation();
        addFunction();
    }

    public void addFunction(){
        System.out.println("为具体的构件者添加额外的功能!");
    }

}
