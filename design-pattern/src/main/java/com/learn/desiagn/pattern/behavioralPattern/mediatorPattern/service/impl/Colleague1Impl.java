package com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.service.Colleague;



/**
 * @author : lisy
 * @version $Id: Colleague1Impl, v 0.1 2019年12月13日 11:03 AM lisy Exp $
 */
public class Colleague1Impl extends Colleague
{
    @Override
    public void receive() {
        System.out.println("1 收到信息!");

    }

    @Override
    public void send() {
        System.out.println("1 发出请求");
        mediator.relay(this); //请求转发
    }
}
