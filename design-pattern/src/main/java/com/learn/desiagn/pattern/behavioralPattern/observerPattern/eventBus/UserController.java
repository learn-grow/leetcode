package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author: lisy
 * @version: : UserController , v0.1 2020年04月30日 2:11 下午
 * @remark: the UserController is
 */
public class UserController {

    private Executor executor;

    private List<RegObserver> regObservers = new ArrayList<>();

    public void setRegObservers(RegObserver regObserver){
        regObservers.add(regObserver);
    }

    public UserController(Executor executor){
        this.executor = executor;
    }

    public long register(){
        long userId = System.currentTimeMillis();
        /**
         * 第二种方式 线程池实现
         */
        for (RegObserver regObserver : regObservers) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    regObserver.handlerRegSucess(userId);
                }
            });
        }
        return userId;
    }

}
