package com.learn.desiagn.pattern.behavioralPattern.statePattern.my.state;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.my.State;

/**
 * @author: lisy
 * @version: : SmallMario , v0.1 2020年05月06日 5:15 下午
 * @remark: the SmallMario is
 */
public class SmallMario implements IMario {

    private MarioStateMachine stateMachine;

    public SmallMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        stateMachine.setCurrentState(new SuperMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() { // do nothing...
    }
}
