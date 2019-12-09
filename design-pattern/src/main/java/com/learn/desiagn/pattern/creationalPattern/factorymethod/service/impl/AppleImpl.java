package com.learn.desiagn.pattern.creationalPattern.factorymethod.service.impl;

import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.Phone;

/**
 * @author : lisy
 * @version $Id: Apple, v 0.1 2019年12月09日 2:54 PM lisy Exp $
 */
public class AppleImpl implements Phone {

    /**
     * Apple
     */
    @Override
    public void create() {
        System.out.println("this is Apple");
    }
}
