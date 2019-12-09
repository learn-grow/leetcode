package com.learn.desiagn.pattern.creationalPattern.abstractFactoryPattern.service;

/**
 * @author : lisy
 * @version $Id: IFactory, v 0.1 2019年12月09日 3:30 PM lisy Exp $
 */
public interface IFactory {

    /**
     * 生产
     * @return
     */
    Phone create();

    /**
     * 添加
     * @return
     */
    Color add();
}
