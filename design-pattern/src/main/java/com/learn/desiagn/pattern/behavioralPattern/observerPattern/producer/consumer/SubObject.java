package com.learn.desiagn.pattern.behavioralPattern.observerPattern.producer.consumer;

import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.Observer;

/**
 * @author: lisy
 * @version: : Object , v0.1 2020年04月30日 1:48 下午
 * @remark: the Object is
 */
public interface SubObject {

    void registerObserver(ObServer obServer);

    void removeObserver(Observer observer);

    void notifyObserver(Message message);
}
