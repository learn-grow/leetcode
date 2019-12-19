package com.learn.desiagn.pattern.behavioralPattern.interpreterPattern.service;

/**
 * @author : lisy
 * @version $Id: AbstractExpression, v 0.1 2019年12月13日 3:39 PM lisy Exp $
 * 抽象表达式类
 */
public interface AbstractExpression {

    public boolean interpret(String info); //解释方法
}
