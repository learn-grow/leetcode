package com.learn.desiagn.pattern.behavioralPattern.statePattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.service.Context;
import com.learn.desiagn.pattern.behavioralPattern.statePattern.service.State;

/**
 * @author : lisy
 * @version $Id: StateAimpl, v 0.1 2019年12月12日 8:12 PM lisy Exp $
 */
public class StateAimpl extends State {


    @Override
    public void handle(Context context) {
        System.out.println("当前状态为A");
        context.setState(new StateBimpl());
    }
}
