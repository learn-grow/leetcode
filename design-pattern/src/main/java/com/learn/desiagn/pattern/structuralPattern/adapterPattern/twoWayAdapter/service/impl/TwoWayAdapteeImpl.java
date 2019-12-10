package com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.impl;

import com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.TwoWayAdaptee;

/**
 * @author : lisy
 * @version $Id: TwoWayAdapteeImpl, v 0.1 2019年12月10日 5:00 PM lisy Exp $
 */
public class TwoWayAdapteeImpl implements TwoWayAdaptee {

    @Override
    public void specificRequest() {
        System.out.println("适配者代码被执行!");
    }
}
