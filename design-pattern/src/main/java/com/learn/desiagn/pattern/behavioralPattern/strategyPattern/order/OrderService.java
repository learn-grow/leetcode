package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order.impl.DisCountStrategyFactory;

/**
 * @author: lisy
 * @version: : OrderService , v0.1 2020年05月06日 10:55 上午
 * @remark: the OrderService is
 */
public class OrderService {

    public static double discount(Order order){
        OrderTypeEnum type = null;
        int typeValue = order.getType();
        switch (typeValue){
            case 1:
                type = OrderTypeEnum.NORMAL;
                break;
            case 2:
                type = OrderTypeEnum.GROUP;
                break;
            case 3:
                type = OrderTypeEnum.PROMOTION;
                break;
            default:
                type = OrderTypeEnum.NORMAL;
                break;
        }
        DisCountStrategy disCountStrategy = DisCountStrategyFactory.getStrategy(type);
        return disCountStrategy.calDicount(order);
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.setPrice(100);
        order.setType(3);
        System.out.println(discount(order));
    }
}
