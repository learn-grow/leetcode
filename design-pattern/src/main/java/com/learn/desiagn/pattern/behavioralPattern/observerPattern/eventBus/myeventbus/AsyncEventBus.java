package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.myeventbus;

import java.util.concurrent.Executor;

/**
 * @author: lisy
 * @version: : AsyncEventBus , v0.1 2020年04月30日 5:53 下午
 * @remark: the AsyncEventBus is
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor){
        super(executor);
    }
}
