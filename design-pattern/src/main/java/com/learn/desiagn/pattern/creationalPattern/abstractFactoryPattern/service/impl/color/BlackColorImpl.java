package com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.color;

import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.Color;

/**
 * @author : lisy
 * @version $Id: BlackColorImpl, v 0.1 2019年12月09日 3:28 PM lisy Exp $
 */
public class BlackColorImpl implements Color {
    /**
     * black
     */
    @Override
    public void add() {
        System.out.println("this is black color");
    }
}
