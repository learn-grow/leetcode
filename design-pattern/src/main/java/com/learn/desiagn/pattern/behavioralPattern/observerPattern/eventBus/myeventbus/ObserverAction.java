package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.myeventbus;

import com.google.common.base.Preconditions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: lisy
 * @version: : ObserverAction , v0.1 2020年04月30日 5:12 下午
 * @remark: the ObserverAction is
 */
public class ObserverAction {

    /**
     * observeraction 类用来表示@Subscribe 注解的方法，其中 target 表示观察者类
     * method 表示方法 他主要用在observerregister观察者注册表中
     */

    private Object target;

    private Method method;

    public ObserverAction(Object target , Method method){
        this.target = Preconditions.checkNotNull(target);
        this.method = method;
        this.method.setAccessible(true);
    }

    /**
     * event 是method 方法的参数
     * @param event
     */
    public void  execute(Object event){
        try{
            method.invoke(target , event);
        }catch (InvocationTargetException | IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
