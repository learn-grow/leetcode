package com.learn.desiagn.pattern.behavioralPattern.statePattern.my;

/**
 * @author: lisy
 * @version: : State , v0.1 2020年05月06日 4:28 下午
 * @remark: the State is 状态值
 */
public enum  State {

    SMALL(0,"小马里奥"),
    SUPER(1,"超级马里奥"),
    FIRE(2,"火焰马里奥"),
    CAPE(3,"斗篷马里奥");

    private int value;

    private String code;

    private State(int value , String code){
        this.value = value;
        this.code = code;
    }

    public int getValue(){
        return this.value;
    }

    public String getCode(){
        return this.code;
    }
}
