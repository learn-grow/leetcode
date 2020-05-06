package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.impl;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.DisCountStrategy;
import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.OrderTypeEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lisy
 * @version: : DisCountStrategyFactory , v0.1 2020年05月06日 10:50 上午
 * @remark: the DisCountStrategyFactory is
 */
public class DisCountStrategyFactory {

    private static final Map<OrderTypeEnum, DisCountStrategy> strategys = new HashMap<>();

    static {
        strategys.put(OrderTypeEnum.NORMAL , new NormalDiscountStrategy());
        strategys.put(OrderTypeEnum.GROUP , new GrouponDiscountStrategy());
        strategys.put(OrderTypeEnum.PROMOTION , new PromotionDiscountStrategy());
    }

    public static DisCountStrategy getStrategy(OrderTypeEnum type){
        return strategys.get(type);
    }


    public static DisCountStrategy getNewStrategy(OrderTypeEnum type){
        if (type == null){
            throw new IllegalArgumentException("the type is null");
        }
        switch (type){
            case NORMAL:
                return new NormalDiscountStrategy();
            case GROUP:
                return new GrouponDiscountStrategy();
            case PROMOTION:
                return new PromotionDiscountStrategy();
            default:
                return new NormalDiscountStrategy();
        }
    }
}
