package com.learn.desiagn.pattern.creationalPattern.builderPattern.service;

import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.BrandEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.ColorEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.CpuEntity;

/**
 * @author : lisy
 * @version $Id: IBuilderFactory, v 0.1 2019年12月09日 4:10 PM lisy Exp $
 */
public interface IBuilderComputer {

    BrandEntity builderBrand();

    ColorEntity builderColor();

    CpuEntity builderCpu();
}
