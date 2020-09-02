package com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.demo;

import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.Component;

/**
 * @author: lisy
 * @version: : Mediator , v0.1 2020年06月03日 3:16 下午
 * @remark: the Mediator is 中介模式 - 中介者
 */
public interface Mediator {

    void handleEvent(Component component , String event);
}
