package com.learn.desiagn.pattern.behavioralPattern.statePattern;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.service.Context;

/**
 * @author : lisy
 * @version $Id: StateClient, v 0.1 2019年12月12日 8:09 PM lisy Exp $
 */
public class StateClient {

    public static void main(String args[]){
        Context context = new Context();
        context.haddle();
        context.haddle();
        context.haddle();
        context.haddle();
    }
}
