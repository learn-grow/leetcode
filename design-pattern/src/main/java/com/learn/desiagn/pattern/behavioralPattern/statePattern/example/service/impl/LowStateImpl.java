package com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service.AbstaractState;
import com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service.ScoreContext;

/**
 * @author : lisy
 * @version $Id: LowStateImpl, v 0.1 2019年12月12日 8:22 PM lisy Exp $
 */
public class LowStateImpl extends AbstaractState {


    public LowStateImpl(ScoreContext h) {
        context = h;
        stateName = "不及格";
        score = 0;
    }

    public LowStateImpl(AbstaractState abstaractState) {
        context = abstaractState.context;
        stateName = "不及格";
        score = abstaractState.score;
    }


    @Override
    public void checkScore() {
        if (score >= 90) {
            context.setAbstaractState(new HightStateImpl(this));
        } else if (score >= 60) {
            context.setAbstaractState(new MiddleStateImpl(this));
        }
    }
}
