package com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.color;

import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.Color;

/**
 * @author : lisy
 * @version $Id: GoldenColorImpl, v 0.1 2019年12月09日 3:29 PM lisy Exp $
 */
public class GoldenColorImpl implements Color {
    /**
     * golden
     */
    @Override
    public void add() {
        System.out.println("this is golden color");
    }
}
