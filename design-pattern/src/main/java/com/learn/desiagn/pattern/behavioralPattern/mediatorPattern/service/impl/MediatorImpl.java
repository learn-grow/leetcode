package com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.Colleague;
import com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lisy
 * @version $Id: MediatorImpl, v 0.1 2019年12月13日 11:05 AM lisy Exp $
 */
public class MediatorImpl extends Mediator{

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void reguster(Colleague colleague) {
        if (!colleagues.contains(colleague))
            colleagues.add(colleague);
            colleague.setMediator(this);
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague o : colleagues) {
            if (!o.equals(colleague))
                o.receive();
        }
    }
}
