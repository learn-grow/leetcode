package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.Element;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.Visitor;

/**
 * @author : lisy
 * @version $Id: ElementA, v 0.1 2019年12月13日 3:00 PM lisy Exp $
 */
public class ElementA implements Element{


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "A的操作";
    }
}
