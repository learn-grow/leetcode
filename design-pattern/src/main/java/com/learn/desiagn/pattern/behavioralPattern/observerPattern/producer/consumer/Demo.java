package com.learn.desiagn.pattern.behavioralPattern.observerPattern.producer.consumer;

/**
 * @author: lisy
 * @version: : Demo , v0.1 2020年04月30日 1:55 下午
 * @remark: the Demo is
 */
public class Demo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObserver(new Message());
    }
}
