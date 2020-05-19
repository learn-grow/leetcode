package com.learn.desiagn.pattern.behavioralPattern.iterator;

/**
 * @author: lisy
 * @version: : List , v0.1 2020年05月18日 1:08 下午
 * @remark: the List is java arraylist 迭代器的实现
 */
public interface List<E> {

    Iterator<E> iterator();
}
