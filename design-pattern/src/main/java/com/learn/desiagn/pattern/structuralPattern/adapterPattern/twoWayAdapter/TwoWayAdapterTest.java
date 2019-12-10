package com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter;

import com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.TwoWayAdaptee;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.TwoWayAdapter;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.TwoWayTarget;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.impl.TwoWayAdapteeImpl;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service.impl.TwoWayTargetImpl;

/**
 * @author : lisy
 * @version $Id: TwoWayAdapterTest, v 0.1 2019年12月10日 4:57 PM lisy Exp $
 * 双向适配器
 */
public class TwoWayAdapterTest {

    public static void main(String args[]){
        TwoWayAdaptee twoWayAdaptee = new TwoWayAdapteeImpl();
        TwoWayTarget twoWayTarget = new TwoWayAdapter(twoWayAdaptee);
        twoWayTarget.request();


        twoWayTarget = new TwoWayTargetImpl();
        twoWayAdaptee = new TwoWayAdapter(twoWayTarget);
        twoWayAdaptee.specificRequest();
    }
}
