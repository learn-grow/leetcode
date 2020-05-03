package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.google;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author: lisy
 * @version: : UserController , v0.1 2020年04月30日 2:20 下午
 * @remark: the UserController is
 */
public class UserController {

    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController(){

        //eventBus = new EventBus(); //同步阻塞
        /**
         * 异步非阻塞
         */
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setEventBus(List<Object> observers){
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public long register(){
        long userId = System.currentTimeMillis();
        eventBus.post(userId);
        return userId;
    }

}
