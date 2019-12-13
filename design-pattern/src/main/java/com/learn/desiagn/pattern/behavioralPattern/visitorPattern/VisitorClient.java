package com.learn.desiagn.pattern.behavioralPattern.visitorPattern;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.Visitor;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.impl.ElementA;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.impl.ElementB;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.impl.VisitorA;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.impl.Visitorb;

/**
 * @author : lisy
 * @version $Id: VisitorClient, v 0.1 2019年12月13日 2:56 PM lisy Exp $
 */
public class VisitorClient {

    public static void main(String args[]){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ElementA());
        objectStructure.add(new ElementB());
        Visitor visitor = new VisitorA();
        objectStructure.accept(visitor);

        System.out.println("------------");

        visitor = new Visitorb();

        objectStructure.accept(visitor);
    }
}
