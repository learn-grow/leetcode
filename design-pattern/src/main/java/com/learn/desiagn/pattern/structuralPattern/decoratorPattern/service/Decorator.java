package com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service;

import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.Component;

/**
 * @author : lisy
 * @version $Id: Decorator, v 0.1 2019年12月10日 6:43 PM lisy Exp $
 */
public class Decorator implements Component{

    private Component component;
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
