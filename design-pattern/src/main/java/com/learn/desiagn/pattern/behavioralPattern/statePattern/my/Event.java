package com.learn.desiagn.pattern.behavioralPattern.statePattern.my;

/**
 * @author: lisy
 * @version: : Event , v0.1 2020年05月06日 4:55 下午
 * @remark: the Event is 状态模式查表表的实现，定义了所有的事件
 */
public enum  Event {

    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3);

    private int value;

    private Event(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
