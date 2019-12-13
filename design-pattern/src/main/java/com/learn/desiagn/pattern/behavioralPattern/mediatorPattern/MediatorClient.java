package com.learn.desiagn.pattern.behavioralPattern.mediatorPattern;

import com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.Colleague;
import com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.Mediator;
import com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.impl.Colleague1Impl;
import com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.impl.Colleague2Impl;
import com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.impl.MediatorImpl;

/**
 * @author : lisy
 * @version $Id: MediatorClient, v 0.1 2019年12月13日 10:55 AM lisy Exp $
 */
public class MediatorClient {


    public static void main(String args[]){
        Mediator m1 = new MediatorImpl();

        Colleague c1,c2;

        c1 = new Colleague1Impl();
        c2 = new Colleague2Impl();

        m1.reguster(c1);
        m1.reguster(c2);
        c1.send();
        System.out.println("-----------");
        c2.send();
    }
}
