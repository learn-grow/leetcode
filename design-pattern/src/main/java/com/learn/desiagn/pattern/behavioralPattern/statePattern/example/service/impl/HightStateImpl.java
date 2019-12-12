package com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service.AbstaractState;
import com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service.ScoreContext;

/**
 * @author : lisy
 * @version $Id: LowStateImpl, v 0.1 2019年12月12日 8:22 PM lisy Exp $
 */
public class HightStateImpl extends AbstaractState{

    public HightStateImpl(AbstaractState abstaractState){
        context = abstaractState.context;
        stateName = "优秀";
        score = abstaractState.score;
    }

    @Override
    public void checkScore() {

        if (score < 60){
            context.setAbstaractState(new LowStateImpl(this));
        }else if (score < 90){
            context.setAbstaractState(new MiddleStateImpl(this));
        }

    }
}
