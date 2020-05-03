package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.google;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.Executors;

/**
 * @author: lisy
 * @version: : GoogleEventBus , v0.1 2020年04月30日 2:30 下午
 * @remark: the GoogleEventBus is
 */
public class GoogleEventBus {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus(); //同步阻塞方式
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(8)); //异步非阻塞方式


        //eventBus.register(Object object); // 注册观察者
        //eventBus.unregister(Object object); 从eventbus中删除某个观察者
        //post(); 用来给观察者发送消息

        //Subscribe 改注解会将函数的能接受的消息类型注册到 eventbus上，当我们调用时，eventBus会通过消息类型找到具体的对应函数


    }
}
