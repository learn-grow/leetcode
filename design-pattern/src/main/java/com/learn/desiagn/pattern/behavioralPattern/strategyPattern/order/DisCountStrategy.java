package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order;

/**
 * @author: lisy
 * @version: : DisCountStrategy , v0.1 2020年05月06日 10:43 上午
 * @remark: the DisCountStrategy is 策略的定义
 */
public interface DisCountStrategy {

    double calDicount(Order order);
}
