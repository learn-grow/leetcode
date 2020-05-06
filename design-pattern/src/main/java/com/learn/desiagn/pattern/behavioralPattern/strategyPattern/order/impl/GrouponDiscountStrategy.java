package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.impl;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.DisCountStrategy;
import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.Order;

/**
 * @author: lisy
 * @version: : GrouponDiscountStrategy , v0.1 2020年05月06日 10:47 上午
 * @remark: the GrouponDiscountStrategy is 团购策略
 */
public class GrouponDiscountStrategy implements DisCountStrategy {

    @Override
    public double calDicount(Order order) {
        return order.getPrice() * 0.75;
    }
}
