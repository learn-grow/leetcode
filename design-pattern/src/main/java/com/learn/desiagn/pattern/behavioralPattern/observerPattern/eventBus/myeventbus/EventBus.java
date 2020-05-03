package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.myeventbus;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author: lisy
 * @version: : EventBus , v0.1 2020年04月30日 5:48 下午
 * @remark: the EventBus is
 */
public class EventBus {

    private Executor executor;

    private ObserverRegister register = new ObserverRegister();

    public EventBus(){
        this(MoreExecutors.directExecutor());
    }

    protected EventBus(Executor executor){
        this.executor = executor;
    }

    public void register(Object object){
        register.register(object);
    }

    public void post(Object event){
        List<ObserverAction> observerActions = register.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observerAction.execute(event);
                }
            });
        }
    }
}
