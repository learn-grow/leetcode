package com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.service;

/**
 * @author : lisy
 * @version $Id: Iterator, v 0.1 2019年12月13日 2:27 PM lisy Exp $
 * 抽象迭代器
 */
public interface MyIterator {

    Object first();

    Object next();

    boolean hashNext();
}
