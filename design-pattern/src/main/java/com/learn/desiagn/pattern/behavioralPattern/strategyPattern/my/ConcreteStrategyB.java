package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.my;

/**
 * @author: lisy
 * @version: : ConcreteStrategyB , v0.1 2020年05月06日 10:15 上午
 * @remark: the ConcreteStrategyB is
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("strategy b");
    }
}
