package com.learn.desiagn.pattern.behavioralPattern.statePattern.service;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.service.impl.StateAimpl;

/**
 * @author : lisy
 * @version $Id: Context, v 0.1 2019年12月12日 8:10 PM lisy Exp $
 */
public class Context {

    private State state;

    public Context(){
        this.state = new StateAimpl();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void haddle(){
        state.handle(this);
    }

}
