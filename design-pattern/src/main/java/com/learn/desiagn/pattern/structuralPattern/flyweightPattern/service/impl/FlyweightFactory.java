package com.learn.desiagn.pattern.structuralPattern.flyweightPattern.service.impl;

import com.learn.desiagn.pattern.structuralPattern.flyweightPattern.service.IFlyweight;

import java.util.HashMap;

/**
 * @author : lisy
 * @version $Id: FlyweightFactory, v 0.1 2019年12月11日 11:07 AM lisy Exp $
 * 享元工厂
 */
public class FlyweightFactory {

    private static HashMap<String, IFlyweight> pool = new HashMap<>();

    /**
     * 内部状态不变性，因此作为缓存的键
     * @param initStr
     * @return
     */
    public static IFlyweight getFlyweight(String initStr) {
        if (!pool.containsKey(initStr)) {
            IFlyweight flyweight = new FlyweightImpl(initStr);
            pool.put(initStr, flyweight);
        }
        return pool.get(initStr);
    }
}
