package com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service;

/**
 * @author : lisy
 * @version $Id: Mediator, v 0.1 2019年12月13日 11:00 AM lisy Exp $
 * 中介者
 */
public abstract class Mediator {

    //注册
    public abstract void reguster(Colleague colleague);

    //转发
    public abstract void relay(Colleague colleague);


}
