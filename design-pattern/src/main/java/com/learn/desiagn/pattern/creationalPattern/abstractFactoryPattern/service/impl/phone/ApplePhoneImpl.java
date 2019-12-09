package com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.phone;

import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.Phone;

/**
 * @author : lisy
 * @version $Id: ApplePhoneImpl, v 0.1 2019年12月09日 3:26 PM lisy Exp $
 */
public class ApplePhoneImpl implements Phone {

    /**
     * apple
     */
    @Override
    public void create() {

        System.out.println("this is apple phone");
    }
}
