package com.learn.desiagn.pattern.behavioralPattern.mementoPattern.service;

/**
 * @author : lisy
 * @version $Id: Memento, v 0.1 2019年12月13日 3:25 PM lisy Exp $
 * 备忘录
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
