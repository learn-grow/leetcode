package com.learn.desiagn.pattern.creationalPattern.builderPattern.service.factory;

import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.ComputerEntity;

/**
 * @author : lisy
 * @version $Id: IBuilderFactory, v 0.1 2019年12月09日 4:13 PM lisy Exp $
 * 指挥者
 */
public interface IBuilderDirecto {

    //电脑组装
    ComputerEntity createComputer();
}
