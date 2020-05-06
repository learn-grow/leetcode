package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.impl;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.DisCountStrategy;
import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.Order;

/**
 * @author: lisy
 * @version: : PromotionDiscountStrategy , v0.1 2020年05月06日 10:48 上午
 * @remark: the PromotionDiscountStrategy is 促销活动策略
 */
public class PromotionDiscountStrategy implements DisCountStrategy {
    @Override
    public double calDicount(Order order) {
        return order.getPrice() * 0.95;
    }
}
