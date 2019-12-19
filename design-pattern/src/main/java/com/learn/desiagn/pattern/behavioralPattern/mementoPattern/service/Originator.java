package com.learn.desiagn.pattern.behavioralPattern.mementoPattern.service;

/**
 * @author : lisy
 * @version $Id: Originator, v 0.1 2019年12月13日 3:26 PM lisy Exp $
 * 发起人
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }

}
