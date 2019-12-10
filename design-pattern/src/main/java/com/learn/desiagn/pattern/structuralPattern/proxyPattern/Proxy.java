package com.learn.desiagn.pattern.structuralPattern.proxyPattern;

import com.learn.desiagn.pattern.structuralPattern.proxyPattern.service.ISubject;
import com.learn.desiagn.pattern.structuralPattern.proxyPattern.service.RealSubject;

/**
 * @author : lisy
 * @version $Id: Proxy, v 0.1 2019年12月10日 3:37 PM lisy Exp $
 */
public class Proxy implements ISubject {

    private RealSubject realSubject;

    @Override
    public void request() {

        if (realSubject == null)
            realSubject = new RealSubject();

        preRequest();
        realSubject.request();
        postRequest();

    }

    private void preRequest(){
        System.out.println("预处理!");
    }

    private void postRequest(){
        System.out.println("后置处理！");
    }
}
