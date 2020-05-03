package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.google;

import com.google.common.eventbus.Subscribe;

/**
 * @author: lisy
 * @version: : SNSObserverImpl , v0.1 2020年04月30日 2:29 下午
 * @remark: the SNSObserverImpl is
 */
public class SNSObserverImpl {

    @Subscribe
    public void handler(){
        System.out.println("站内信发送");
    }
}
