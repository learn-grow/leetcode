package com.learn.desiagn.pattern.behavioralPattern.interpreterPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.interpreterPattern.service.AbstractExpression;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : lisy
 * @version $Id: TerminalExpression, v 0.1 2019年12月13日 3:40 PM lisy Exp $
 */
public class TerminalExpression implements AbstractExpression {


    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data){
        for (String datum : data) {
            set.add(datum);
        }
    }

    @Override
    public boolean interpret(String info) {
        if (set.contains(info)){
            return true;
        }
        return false;
    }
}
