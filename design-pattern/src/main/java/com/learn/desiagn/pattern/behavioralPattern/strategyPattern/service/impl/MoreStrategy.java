package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.Strategy;

/**
 * @author : lisy
 * @version $Id: MoreStrategy, v 0.1 2019年12月11日 3:27 PM lisy Exp $
 */
public class MoreStrategy implements Strategy {

    @Override
    public void strategy() {
        System.out.println("取余运算");
    }
}
