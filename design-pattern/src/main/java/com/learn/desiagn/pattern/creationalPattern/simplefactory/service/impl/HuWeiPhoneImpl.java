package com.learn.desiagn.pattern.creationalPattern.simplefactory.service.impl;

import com.learn.desiagn.pattern.creationalPattern.simplefactory.service.Phone;

/**
 * @author : lisy
 * @version $Id: HuWei, v 0.1 2019年12月09日 2:13 PM lisy Exp $
 */
public class HuWeiPhoneImpl implements Phone {

    /**
     * huawei
     */
    @Override
    public void run() {
        System.out.println("生产华为！");
    }
}
