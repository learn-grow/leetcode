package com.learn.desiagn.pattern.behavioralPattern.statePattern.my;

/**
 * @author: lisy
 * @version: : ApplactionDemo , v0.1 2020年05月06日 4:39 下午
 * @remark: the ApplactionDemo is
 */
public class ApplactionDemo {

    public static void main(String[] args) {
        MarioStateMachineEvent marioStateMachine = new MarioStateMachineEvent();
        marioStateMachine.obtainMushRoom();
        int score = marioStateMachine.getScore();
        State state = marioStateMachine.getCurrentState();
        System.out.println("marion score :" + score + ",state :" + state.getCode());
    }
}
