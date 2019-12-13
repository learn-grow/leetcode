package com.learn.desiagn.pattern.behavioralPattern.iteratorPattern;

import com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service.MyIterator;
import com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service.impl.AggregateImpl;

/**
 * @author : lisy
 * @version $Id: IteratorClient, v 0.1 2019年12月13日 2:23 PM lisy Exp $
 */
public class IteratorClient {

    public static void main(String args[]){

        AggregateImpl aggregate = new AggregateImpl();
        aggregate.add("北京");
        aggregate.add("上海");
        aggregate.add("广州");

        System.out.println("所有城市信息！");
        MyIterator iterator = aggregate.getIterator();
        while (iterator.hashNext()){
            Object object = iterator.next();
            System.out.println(object.toString());
        }

        Object o1 = iterator.first();

        System.out.println("first:" +o1);
    }
}
