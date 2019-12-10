package com.learn.desiagn.pattern.structuralPattern.adapterPattern.twoWayAdapter.service;

/**
 * @author : lisy
 * @version $Id: TwoWayAdapter, v 0.1 2019年12月10日 5:01 PM lisy Exp $
 */
public class TwoWayAdapter implements TwoWayAdaptee,TwoWayTarget {

    private TwoWayTarget twoWayTarget;
    private TwoWayAdaptee twoWayAdaptee;


    public TwoWayAdapter(TwoWayTarget twoWayTarget){
        this.twoWayTarget = twoWayTarget;
    }

    public TwoWayAdapter(TwoWayAdaptee twoWayAdaptee){
        this.twoWayAdaptee = twoWayAdaptee;
    }


    @Override
    public void specificRequest() {
        twoWayTarget.request();
    }

    @Override
    public void request() {
        twoWayAdaptee.specificRequest();
    }
}
