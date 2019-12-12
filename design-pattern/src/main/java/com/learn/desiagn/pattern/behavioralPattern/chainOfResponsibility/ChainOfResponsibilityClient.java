package com.learn.desiagn.pattern.behavioralPattern.chainOfResponsibility;

import com.learn.desiagn.pattern.behavioralPattern.chainOfResponsibility.service.ConcreteHandler1;
import com.learn.desiagn.pattern.behavioralPattern.chainOfResponsibility.service.ConcreteHandler2;
import com.learn.desiagn.pattern.behavioralPattern.chainOfResponsibility.service.Handler;

/**
 * @author : lisy
 * @version $Id: ChainOfResponsibilityClient, v 0.1 2019年12月12日 3:44 PM lisy Exp $
 */
public class ChainOfResponsibilityClient {

    public static void main(String args[]){
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setHandler(handler2);
        handler1.handlerRequest("two1");
    }
}
