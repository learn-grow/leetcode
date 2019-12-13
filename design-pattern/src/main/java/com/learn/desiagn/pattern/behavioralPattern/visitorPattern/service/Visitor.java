package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.impl.ElementA;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.impl.ElementB;

/**
 * @author : lisy
 * @version $Id: Visitor, v 0.1 2019年12月13日 2:56 PM lisy Exp $
 *
 */
public interface Visitor {

    public void visit(ElementA elementA);

    public void visit(ElementB elementB);
}
