package com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service.MyIterator;

import java.util.List;

/**
 * @author : lisy
 * @version $Id: MyItergateImpl, v 0.1 2019年12月13日 2:30 PM lisy Exp $
 * 迭代器实现
 */
public class MyItergateImpl implements MyIterator {

    private List<Object> list = null;
    private int index = -1;

    public MyItergateImpl(List<Object> list) {
        this.list = list;
    }


    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hashNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hashNext() {
        if (index < list.size() - 1)
            return true;
        else
            return false;
    }
}
