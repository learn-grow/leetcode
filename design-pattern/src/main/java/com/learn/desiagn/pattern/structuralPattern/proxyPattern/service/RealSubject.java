package com.learn.desiagn.pattern.structuralPattern.proxyPattern.service;

/**
 * @author : lisy
 * @version $Id: RealSubject, v 0.1 2019年12月10日 3:36 PM lisy Exp $
 */
public class RealSubject implements ISubject {


    @Override
    public void request() {
        System.out.println("this is real subject!");
    }
}
