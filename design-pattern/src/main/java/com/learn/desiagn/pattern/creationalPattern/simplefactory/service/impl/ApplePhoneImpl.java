package com.learn.desiagn.pattern.creationalPattern.simplefactory.service.impl;

import com.learn.desiagn.pattern.creationalPattern.simplefactory.service.Phone;

/**
 * @author : lisy
 * @version $Id: Iphone, v 0.1 2019年12月09日 2:12 PM lisy Exp $
 */
public class ApplePhoneImpl implements Phone {
    /**
     * iPhone
     */
    @Override
    public void run() {
        System.out.println("生产iPhone");
    }
}
