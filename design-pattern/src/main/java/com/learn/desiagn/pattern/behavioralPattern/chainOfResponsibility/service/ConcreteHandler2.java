package com.learn.desiagn.pattern.behavioralPattern.chainOfResponsibility.service;

/**
 * @author : lisy
 * @version $Id: ConcreteHandler1, v 0.1 2019年12月12日 5:20 PM lisy Exp $
 */
public class ConcreteHandler2 extends Handler{



    @Override
    public void handlerRequest(String request) {
        if (request.equals("two")){
            System.out.println("逻辑2");
        }else {
            if (getNext() != null){
                getNext().handlerRequest(request);
            }else{
                System.out.println("没有处理的handler");
            }
        }
    }
}
