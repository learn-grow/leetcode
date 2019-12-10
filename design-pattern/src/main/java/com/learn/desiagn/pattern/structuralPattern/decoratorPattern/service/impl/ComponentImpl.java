package com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.impl;

import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.Component;

/**
 * @author : lisy
 * @version $Id: ComponentImpl, v 0.1 2019年12月10日 6:42 PM lisy Exp $
 */
public class ComponentImpl implements Component {

    public ComponentImpl(){
        System.out.println("创建具体的构件角色");
    }
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的operation()方法");
    }
}
