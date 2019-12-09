package com.learn.desiagn.pattern.creationalPattern.factorymethod.service.impl;

import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.IFactory;
import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.Phone;

/**
 * @author : lisy
 * @version $Id: HuaWeiFactory, v 0.1 2019年12月09日 3:13 PM lisy Exp $
 */
public class HuaWeiFactoryImpl implements IFactory {

    /**
     * huawei factory
     * @return
     */
    @Override
    public Phone createFactory() {
        return new HuaWeiImpl();
    }
}
