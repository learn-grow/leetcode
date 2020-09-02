package com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.demo;

/**
 * @author: lisy
 * @version: : NumberExpression , v0.1 2020年06月03日 2:55 下午
 * @remark: the NumberExpression is
 */
public class NumberExpression implements Expression {

    private long number;

    public NumberExpression(long number){
        this.number = number;
    }

    public NumberExpression(String number){
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
