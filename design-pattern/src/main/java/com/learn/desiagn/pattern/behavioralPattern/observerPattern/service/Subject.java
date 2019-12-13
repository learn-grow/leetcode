package com.learn.desiagn.pattern.behavioralPattern.observerPattern.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lisy
 * @version $Id: Subject, v 0.1 2019年12月13日 10:39 AM lisy Exp $
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        this.observers.add(observer);
    }

    public void remove(Observer observer){
        this.observers.remove(observer);
    }

    public abstract void notifyObserver(); //通知观察者

}
