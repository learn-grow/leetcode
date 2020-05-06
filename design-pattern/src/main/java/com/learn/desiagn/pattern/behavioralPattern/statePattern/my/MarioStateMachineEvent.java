package com.learn.desiagn.pattern.behavioralPattern.statePattern.my;

import static com.learn.desiagn.pattern.behavioralPattern.statePattern.my.State.*;

/**
 * @author: lisy
 * @version: : MarioStateMachine , v0.1 2020年05月06日 4:30 下午
 * @remark: the MarioStateMachine is 事件 对应的行为-action
 * 状态机 查表表实现，定义了一个二维数组存储对应事件的action
 */
public class MarioStateMachineEvent {

    private int score;

    private State currentState;

    private static final State[][] transitionTable = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL},
    };
    private static final int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    public MarioStateMachineEvent(){
        this.score = 0;
        this.currentState = SMALL;
    }

    public void obtainMushRoom(){
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape(){
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower(){
        executeEvent(Event.GOT_FIRE);
    }
    public void executeEvent(Event event){
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateValue][eventValue];
        this.score = actionTable[stateValue][eventValue];
    }


    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}
