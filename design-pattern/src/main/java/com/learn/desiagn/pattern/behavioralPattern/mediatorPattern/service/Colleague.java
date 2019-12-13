package com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service;

/**
 * @author : lisy
 * @version $Id: Colleague, v 0.1 2019年12月13日 11:01 AM lisy Exp $
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
