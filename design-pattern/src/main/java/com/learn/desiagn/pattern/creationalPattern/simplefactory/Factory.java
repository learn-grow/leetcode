package com.learn.desiagn.pattern.creationalPattern.simplefactory;

import com.learn.desiagn.pattern.creationalPattern.simplefactory.service.Phone;
import com.learn.desiagn.pattern.creationalPattern.simplefactory.service.impl.ApplePhoneImpl;
import com.learn.desiagn.pattern.creationalPattern.simplefactory.service.impl.HuWeiPhoneImpl;

/**
 * @author : lisy
 * @version $Id: Factory, v 0.1 2019年12月09日 2:14 PM lisy Exp $
 */
public class Factory {

    /**
     * 工厂
     * @param product
     * @return
     * @throws Exception
     */
    Phone product(String product) throws Exception {
        if (product.equals("Apple"))
            return new ApplePhoneImpl();
        if (product.equals("HuaWei"))
            return new HuWeiPhoneImpl();
        throw new Exception("no such class");
    }
}
