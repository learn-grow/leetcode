package com.learn.desiagn.pattern.creationalPattern.factorymethod.service.impl;

import com.learn.desiagn.pattern.creationalPattern.factorymethod.service.Phone;

/**
 * @author : lisy
 * @version $Id: HuaWeiImpl, v 0.1 2019年12月09日 3:11 PM lisy Exp $
 */
public class HuaWeiImpl implements Phone {

    /**
     * huawei
     */
    @Override
    public void create() {
        System.out.println("this is huawei");
    }
}
