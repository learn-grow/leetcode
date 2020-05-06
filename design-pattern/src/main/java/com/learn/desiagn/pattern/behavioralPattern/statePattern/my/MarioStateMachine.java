package com.learn.desiagn.pattern.behavioralPattern.statePattern.my;

/**
 * @author: lisy
 * @version: : MarioStateMachine , v0.1 2020年05月06日 4:30 下午
 * @remark: the MarioStateMachine is 事件 对应的行为-action
 * 状态机 分支法的实现
 */
public class MarioStateMachine {

    private int score;

    private State currentState;

    public MarioStateMachine(){
        this.score = 0;
        this.currentState = State.SMALL; //初始状态
    }

    public void obtainMushRoom(){ // 吃蘑菇事件
        if (this.currentState.equals(State.SMALL)){
            this.currentState = State.SUPER;
            this.score += 100;
        }
    }


    public void obtainCape(){ //获得斗篷
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)){
            this.currentState = State.CAPE;
            this.score += 300;
        }
    }

    public void obtainFireFlower(){ //获得花朵
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)){
            this.currentState = State.FIRE;
            this.score += 200;
        }
    }

    public void meetMonster(){ //遇到怪物
        if (currentState.equals(State.SUPER)) {
            this.currentState = State.SMALL;
            this.score -= 100;
            return;
        }
        if (currentState.equals(State.CAPE)) {
            this.currentState = State.SMALL;
            this.score -= 200;
            return;
        }
        if (currentState.equals(State.FIRE)) {
            this.currentState = State.SMALL;
            this.score -= 300;
            return;
        }
    }

    public int getScore(){
        return this.score;
    }

    public State getCurrentState(){
        return this.currentState;
    }
}
