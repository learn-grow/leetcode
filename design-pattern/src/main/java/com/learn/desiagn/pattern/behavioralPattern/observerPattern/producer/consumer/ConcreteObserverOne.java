package com.learn.desiagn.pattern.behavioralPattern.observerPattern.producer.consumer;

/**
 * @author: lisy
 * @version: : ConcreteObserverOne , v0.1 2020年04月30日 1:54 下午
 * @remark: the ConcreteObserverOne is
 */
public class ConcreteObserverOne implements ObServer {

    @Override
    public void update(Message message) {
        System.out.println("one get the message:" + message);
    }

}
