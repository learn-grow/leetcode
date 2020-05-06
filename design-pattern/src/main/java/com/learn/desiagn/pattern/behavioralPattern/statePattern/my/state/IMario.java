package com.learn.desiagn.pattern.behavioralPattern.statePattern.my.state;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.my.State;

/**
 * @author: lisy
 * @version: : IMario , v0.1 2020年05月06日 5:13 下午
 * @remark: the IMario is
 */
public interface IMario {

    State getName();

    //事件
    //吃蘑菇
    void obtainMushRoom();

    //获得斗篷
    void obtainCape();

    //火花
    void obtainFireFlower();

    //遇到怪
    void meetMonster();
}
