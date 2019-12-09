package com.learn.desiagn.pattern.creationalPattern.factorymethod.service.impl;

import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.IFactory;
import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.Phone;

/**
 * @author : lisy
 * @version $Id: AppleFactory, v 0.1 2019年12月09日 3:12 PM lisy Exp $
 */
public class AppleFactoryImpl implements IFactory {

    /**
     * Apple factory
     * @return
     */
    @Override
    public Phone createFactory() {
        return new AppleImpl();
    }
}
