package com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service;



/**
 * @author : lisy
 * @version $Id: Aggregate, v 0.1 2019年12月13日 2:23 PM lisy Exp $
 */
public interface Aggregate {

    public void add(Object obj);

    public void remove(Object obj);

    public MyIterator getIterator();

}
