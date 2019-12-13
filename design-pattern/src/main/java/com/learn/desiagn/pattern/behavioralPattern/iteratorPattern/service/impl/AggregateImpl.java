package com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service.Aggregate;
import com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : lisy
 * @version $Id: AggregateImpl, v 0.1 2019年12月13日 2:25 PM lisy Exp $
 */
public class AggregateImpl implements Aggregate {
    private List<Object> objects = new ArrayList<>();


    @Override
    public void add(Object obj) {
        this.objects.add(obj);
    }

    @Override
    public void remove(Object obj) {
        this.objects.remove(obj);
    }

    @Override
    public MyIterator getIterator() {
        return new MyItergateImpl(objects);
    }
}
