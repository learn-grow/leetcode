package com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service.impl.LowStateImpl;

/**
 * @author : lisy
 * @version $Id: ScoreContext, v 0.1 2019年12月12日 8:19 PM lisy Exp $
 */
public class ScoreContext {

    private AbstaractState abstaractState;


    public ScoreContext(){
        abstaractState = new LowStateImpl(this);
    }

    public void setAbstaractState(AbstaractState abstaractState){
        this.abstaractState = abstaractState;
    }

    public AbstaractState getAbstaractState() {
        return abstaractState;
    }

    public void add(int score){
        abstaractState.addScore(score);
    }
}
