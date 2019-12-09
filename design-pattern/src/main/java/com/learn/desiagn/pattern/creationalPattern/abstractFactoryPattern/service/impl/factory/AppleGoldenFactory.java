package com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.factory;

import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.Color;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.IFactory;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.Phone;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.phone.ApplePhoneImpl;
import com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service.impl.color.GoldenColorImpl;

/**
 * @author : lisy
 * @version $Id: GoldenColorPhoneFactory, v 0.1 2019年12月09日 3:32 PM lisy Exp $
 */
public class AppleGoldenFactory implements IFactory {


    /**
     * 生产
     * @return
     */
    @Override
    public Phone create() {
        return new ApplePhoneImpl();
    }

    /**
     * 颜色
     * @return
     */
    @Override
    public Color add() {
        return new GoldenColorImpl();
    }
}
