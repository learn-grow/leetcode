package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.Strategy;

/**
 * @author : lisy
 * @version $Id: Context, v 0.1 2019年12月11日 3:28 PM lisy Exp $
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy(){
        return strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void strategy(){
        strategy.strategy();
    }

}
