package com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service;

/**
 * @author : lisy
 * @version $Id: AbstaractState, v 0.1 2019年12月12日 8:18 PM lisy Exp $
 */
public abstract class AbstaractState {

    public ScoreContext context; //环境

    protected String stateName; //状态名称

    public int score; //分数

    public abstract void checkScore();

    public void addScore(int x){
        score+=x;
        checkScore();
        System.out.println("加上:" + x+",当前:" + score + "，当前状态为:" + stateName);
    }



}
