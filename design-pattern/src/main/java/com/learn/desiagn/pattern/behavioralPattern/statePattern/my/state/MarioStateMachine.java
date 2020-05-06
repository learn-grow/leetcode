package com.learn.desiagn.pattern.behavioralPattern.statePattern.my.state;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.my.State;

/**
 * @author: lisy
 * @version: : MarioStateMachine , v0.1 2020年05月06日 5:15 下午
 * @remark: the MarioStateMachine is
 */
public class MarioStateMachine {

    private int score;

    private IMario currentState;

    public MarioStateMachine(){
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    public void obtainMushRoom() {
        this.currentState.obtainMushRoom();
    }

    public void obtainCape() {
        this.currentState.obtainCape();
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower();
    }

    public void meetMonster() {
        this.currentState.meetMonster();
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState.getName();
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }

}
