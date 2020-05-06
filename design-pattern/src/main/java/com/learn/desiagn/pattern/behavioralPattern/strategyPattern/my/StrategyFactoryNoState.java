package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.my;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lisy
 * @version: : StrategyFactory , v0.1 2020年05月06日 10:19 上午
 * @remark: the StrategyFactory is 策略的创建工厂类
 */
public class StrategyFactoryNoState {
    private static final Map<String,Strategy> strategys = new HashMap<>();

    /**
     * 无状态，静态方法，策略只包含了算法而已
     */
    static {
        strategys.put("A", new ConcreteStrategyA());
        strategys.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type){
        if (type == null || type.isEmpty()){
            throw new IllegalArgumentException("type is null");
        }
        return strategys.get(type);
    }
}
