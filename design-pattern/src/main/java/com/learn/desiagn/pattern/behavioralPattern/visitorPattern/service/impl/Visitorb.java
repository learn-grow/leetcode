package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.Visitor;

/**
 * @author : lisy
 * @version $Id: VisitorA, v 0.1 2019年12月13日 3:02 PM lisy Exp $
 */
public class Visitorb implements Visitor{
    @Override
    public void visit(ElementA elementA) {
        System.out.println("具体的访问者A访问--->" + elementA.operationA());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("具体的访问者B访问--->" + elementB.operationA());
    }
}
