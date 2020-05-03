package com.learn.desiagn.pattern.behavioralPattern.observerPattern.producer.consumer;

import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : ConcreteSubject , v0.1 2020年04月30日 1:51 下午
 * @remark: the ConcreteSubject is
 */
public class ConcreteSubject implements SubObject {

    private List<ObServer> observers = new ArrayList<>();

    @Override
    public void registerObserver(ObServer obServer) {
        observers.add(obServer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Message message) {
        for (ObServer observer : observers) {
            observer.update(message);
        }
    }

}
