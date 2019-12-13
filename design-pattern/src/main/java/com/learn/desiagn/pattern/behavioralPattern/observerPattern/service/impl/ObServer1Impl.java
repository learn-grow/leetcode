package com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.observerPattern.service.Observer;

/**
 * @author : lisy
 * @version $Id: ObServer1Impl, v 0.1 2019年12月13日 10:38 AM lisy Exp $
 */
public class ObServer1Impl implements Observer {


    @Override
    public void response() {
        System.out.println("1 开始处理!");
    }
}
