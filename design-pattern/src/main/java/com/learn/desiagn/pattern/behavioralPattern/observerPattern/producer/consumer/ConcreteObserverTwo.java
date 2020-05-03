package com.learn.desiagn.pattern.behavioralPattern.observerPattern.producer.consumer;

/**
 * @author: lisy
 * @version: : ConcreteObserverOne , v0.1 2020年04月30日 1:54 下午
 * @remark: the ConcreteObserverOne is
 */
public class ConcreteObserverTwo implements ObServer {

    @Override
    public void update(Message message) {
        System.out.println("two get the message:" + message);
    }
    
}
