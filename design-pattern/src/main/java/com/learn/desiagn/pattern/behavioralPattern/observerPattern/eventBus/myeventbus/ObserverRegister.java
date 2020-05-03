package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.myeventbus;

import com.google.common.base.Preconditions;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.framework.qual.PreconditionAnnotation;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author: lisy
 * @version: : ObserverRegister , v0.1 2020年04月30日 5:21 下午
 * @remark: the ObserverRegister is
 */
public class ObserverRegister {

    private ConcurrentHashMap<Class<?> , CopyOnWriteArraySet<ObserverAction>> registers = new ConcurrentHashMap<>();

    public void register(Object observer){
        Map<Class<?>, Collection<ObserverAction>> observerActions = findAllObserverActions(observer);
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observerActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registerEventActions = registers.get(eventType);
            if (registerEventActions == null){
                registers.putIfAbsent(eventType , new CopyOnWriteArraySet<>());
                registerEventActions = registers.get(eventType);
            }
            registerEventActions.addAll(eventActions);
        }
    }

    public List<ObserverAction> getMatchedObserverActions(Object event){
        List<ObserverAction> matchedObservers = new ArrayList<>();
        Class<?> postedEventType = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registers.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            if (postedEventType.isAssignableFrom(eventType)){
                matchedObservers.addAll(eventActions);
            }
        }
        return matchedObservers;
    }

    private Map<Class<?> , Collection<ObserverAction>> findAllObserverActions(Object observer){
        Map<Class<?> , Collection<ObserverAction>> observerActions = new HashMap<>();
        Class<?> clazz = observer.getClass();
        for (Method method : getAnnotatedMethods(clazz)) {
            Class<?>[] paramenterTypes = method.getParameterTypes();
            Class<?> eventType = paramenterTypes[0];
            if (!observerActions.containsKey(observer)){
                observerActions.put(eventType , new ArrayList<>());
            }
            observerActions.get(eventType).add(new ObserverAction(observer , method));
        }
        return observerActions;
    }


    private List<Method> getAnnotatedMethods(Class<?> clazz){
        List<Method> annotatedMethods = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)){
                Class<?>[] paramenterTypes = method.getParameterTypes();
                Preconditions.checkArgument(paramenterTypes.length == 1,
                        "Method %s has @Subscribe annotation but has %s parameters."
                                + "Subscriber methods must have exactly 1 parameter.",
                        method,paramenterTypes.length);
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }
}
