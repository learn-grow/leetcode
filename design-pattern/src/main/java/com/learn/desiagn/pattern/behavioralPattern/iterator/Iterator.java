package com.learn.desiagn.pattern.behavioralPattern.iterator;

/**
 * @author: lisy
 * @version: : Iterator , v0.1 2020年05月18日 12:55 下午
 * @remark: the Iterator is 迭代器的实现之一
 */
public interface Iterator<E> {

    boolean hashNext();

    void  next();

    E currentItem();
}
