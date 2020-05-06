package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.my;

/**
 * @author: lisy
 * @version: : ConcreteStrategy , v0.1 2020年05月06日 10:15 上午
 * @remark: the ConcreteStrategy is
 */
public class ConcreteStrategyA implements Strategy {


    @Override
    public void algorithmInterface() {
        System.out.println("strategy a");
    }
}
