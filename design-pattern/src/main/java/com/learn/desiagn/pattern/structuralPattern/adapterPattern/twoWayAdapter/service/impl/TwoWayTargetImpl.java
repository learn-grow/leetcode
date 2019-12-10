package com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.impl;

import com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.TwoWayTarget;

/**
 * @author : lisy
 * @version $Id: TwoWayTargetImpl, v 0.1 2019年12月10日 4:59 PM lisy Exp $
 */
public class TwoWayTargetImpl implements TwoWayTarget {


    @Override
    public void request() {
        System.out.println("目标代码被执行！");
    }
}
