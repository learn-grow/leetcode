package com.learn.desiagn.pattern.structuralPattern.bridgePattern.service;

/**
 * @author : lisy
 * @version $Id: Abstraction, v 0.1 2019年12月10日 6:30 PM lisy Exp $
 * 抽象化角色
 */
public abstract class Abstraction {

    protected Implementor IMPLEMENTOR;

    protected Abstraction(Implementor implementor){
        this.IMPLEMENTOR = implementor;
    }

    public abstract void operation();
}
