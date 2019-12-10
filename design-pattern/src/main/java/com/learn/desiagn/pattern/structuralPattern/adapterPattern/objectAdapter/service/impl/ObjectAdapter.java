package com.learn.desiagn.pattern.structuralPattern.adapterPattern.objectAdapter.service.impl;

import com.learn.desiagn.pattern.structuralPattern.adapterPattern.objectAdapter.service.Adaptee;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.objectAdapter.service.Target;

/**
 * @author : lisy
 * @version $Id: ObjectAdapter, v 0.1 2019年12月10日 4:51 PM lisy Exp $
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
