package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.google;

import com.google.common.eventbus.Subscribe;

/**
 * @author: lisy
 * @version: : RegObserverImpl , v0.1 2020年04月30日 2:28 下午
 * @remark: the RegObserverImpl is
 */
public class RegObserverImpl{

    @Subscribe //注解声明那个接口可以接受到消息
    public void handler(){
        System.out.println("注册发送消息");
    }
}
