package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.my;

/**
 * @author: lisy
 * @version: : StrategyFactoryState , v0.1 2020年05月06日 10:24 上午
 * @remark: the StrategyFactoryState is
 */
public class StrategyFactoryState {

    /**
     * 非静态的去，每次在使用的时候去创建，根据不同的参数创建不同的策略
     * @param type
     * @return
     */
    public static Strategy getStrategy(String type){
        if (type == null || type.isEmpty()){
            throw new IllegalArgumentException("the type is null");
        }
        if (type.equals("A")){
            return new ConcreteStrategyA();
        }else if (type.equals("B")){
            return new ConcreteStrategyB();
        }
        return null;
    }
}
