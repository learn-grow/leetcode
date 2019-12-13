package com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.Observer;
import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.Subject;

/**
 * @author : lisy
 * @version $Id: SubjectImpl, v 0.1 2019年12月13日 10:41 AM lisy Exp $
 */
public class SubjectImpl extends Subject {


    @Override
    public void notifyObserver() {
        System.out.println("目标发生变化.");
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
