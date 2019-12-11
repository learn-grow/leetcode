package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.Strategy;

/**
 * @author : lisy
 * @version $Id: AddStrategy, v 0.1 2019年12月11日 3:26 PM lisy Exp $
 */
public class AddStrategy implements Strategy {


    @Override
    public void strategy() {
        System.out.println("求和运算");
    }
}
