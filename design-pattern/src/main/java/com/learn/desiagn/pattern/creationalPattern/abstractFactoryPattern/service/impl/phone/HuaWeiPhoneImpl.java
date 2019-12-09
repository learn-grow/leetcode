package com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.phone;

import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.Phone;

/**
 * @author : lisy
 * @version $Id: HuaWeiPhoneImpl, v 0.1 2019年12月09日 3:27 PM lisy Exp $
 */
public class HuaWeiPhoneImpl implements Phone {
    /**
     * huawei
     */
    @Override
    public void create() {
        System.out.println("this is huawei phone");
    }
}
