package com.learn.desiagn.pattern.behavioralPattern.strategyPattern;

import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.Strategy;
import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.impl.AddStrategy;
import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.impl.Context;
import com.learn.desiagn.pattern.behavioralPattern.strategyPattern.service.impl.MoreStrategy;

/**
 * @author : lisy
 * @version $Id: StrateClient, v 0.1 2019年12月11日 3:25 PM lisy Exp $
 */
public class StrateClient {

    public static void main(String args[]){
        Context context = new Context();
        Strategy strategy = new AddStrategy();
        context.setStrategy(strategy);
        context.strategy();

        System.out.println("---------------------");
        strategy = new MoreStrategy();
        context.setStrategy(strategy);
        context.strategy();
    }
}
