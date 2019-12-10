package com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.impl;

import com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.Abstraction;
import com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.Implementor;

/**
 * @author : lisy
 * @version $Id: RefinedAbstraction, v 0.1 2019年12月10日 6:32 PM lisy Exp $
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor){
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化角色被访问");
        IMPLEMENTOR.operationImpl();
    }
}
