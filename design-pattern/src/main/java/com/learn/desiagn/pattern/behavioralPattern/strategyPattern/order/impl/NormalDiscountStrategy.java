package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.impl;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.DisCountStrategy;
import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.Order;

/**
 * @author: lisy
 * @version: : NormalDiscountStrategy , v0.1 2020年05月06日 10:45 上午
 * @remark: the NormalDiscountStrategy is 无折扣
 */
public class NormalDiscountStrategy implements DisCountStrategy {

    @Override
    public double calDicount(Order order) {
        return order.getPrice();
    }
}
