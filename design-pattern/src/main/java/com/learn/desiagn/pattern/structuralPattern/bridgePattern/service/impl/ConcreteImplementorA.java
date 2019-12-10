package com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.impl;

import com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.Implementor;

/**
 * @author : lisy
 * @version $Id: ConcreteImplementorA, v 0.1 2019年12月10日 6:28 PM lisy Exp $
 * 具体实现化角色
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("具体实例化(create implementor ) 角色被访问");
    }
}
