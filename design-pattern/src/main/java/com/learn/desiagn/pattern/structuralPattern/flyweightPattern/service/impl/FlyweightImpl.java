package com.learn.desiagn.pattern.structuralPattern.flyweightPattern.service.impl;

import com.learn.desiagn.pattern.structuralPattern.flyweightPattern.service.IFlyweight;

/**
 * @author : lisy
 * @version $Id: FlyweightImpl, v 0.1 2019年12月11日 11:04 AM lisy Exp $
 * 具体的享元实现
 */
public class FlyweightImpl implements IFlyweight {

    private String initStr;

    public FlyweightImpl(String initStr){
        this.initStr = initStr;
    }

    @Override
    public void operation(String extr) {
        System.out.println("object address:" + System.identityHashCode(this));
        System.out.println("initStr :" + this.initStr);
        System.out.println("extr :" + extr);
    }
}
