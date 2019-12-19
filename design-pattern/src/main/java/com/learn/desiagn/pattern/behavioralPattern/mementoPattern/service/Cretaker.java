package com.learn.desiagn.pattern.behavioralPattern.mementoPattern.service;

/**
 * @author : lisy
 * @version $Id: Cretaker, v 0.1 2019年12月13日 3:29 PM lisy Exp $
 */
public class Cretaker {

    private Memento memento;

    public void setMemento(Memento m){
        memento = m;
    }

    public Memento getMemento() {
        return memento;
    }
}
