package com.learn.desiagn.pattern.behavioralPattern.observerPattern;

import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.Observer;
import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.Subject;
import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.impl.ObServer1Impl;
import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.impl.ObServer2Impl;
import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.impl.SubjectImpl;

/**
 * @author : lisy
 * @version $Id: ObserverClient, v 0.1 2019年12月13日 10:36 AM lisy Exp $
 */
public class ObserverClient {

    public static void main(String args[]){
        Subject subject = new SubjectImpl();

        Observer o1 = new ObServer1Impl();
        Observer o2 = new ObServer2Impl();

        subject.add(o1);
        subject.add(o2);

        subject.notifyObserver();
    }
}
