package com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.factory;


import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.Color;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.IFactory;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.Phone;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.color.BlackColorImpl;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.phone.HuaWeiPhoneImpl;

/**
 * @author : lisy
 * @version $Id: HuaWeiBlackFactory, v 0.1 2019年12月09日 3:34 PM lisy Exp $
 */
public class HuaWeiBlackFactory implements IFactory {

    /**
     * 生产
     * @return
     */
    @Override
    public Phone create() {
        return new HuaWeiPhoneImpl();
    }

    /**
     * 颜色
     * @return
     */
    @Override
    public Color add() {
        return new BlackColorImpl();
    }
}
