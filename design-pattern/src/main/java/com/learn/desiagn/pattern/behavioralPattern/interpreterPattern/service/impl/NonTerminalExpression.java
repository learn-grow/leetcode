package com.learn.desiagn.pattern.behavioralPattern.interpreterPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.interpreterPattern.service.AbstractExpression;

/**
 * @author : lisy
 * @version $Id: TerminalExpression, v 0.1 2019年12月13日 3:40 PM lisy Exp $
 */
public class NonTerminalExpression implements AbstractExpression {

    private AbstractExpression expression1;

    private AbstractExpression expression2;

    public NonTerminalExpression(AbstractExpression exp){

    }

    @Override
    public boolean interpret(String info) {

        return true;
    }
}
