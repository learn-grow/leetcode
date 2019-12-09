package com.learn.desiagn.pattern.creationalPattern.builderPattern.service.impl;

import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.BrandEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.ColorEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.CpuEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.service.IBuilderComputer;

/**
 * @author : lisy
 * @version $Id: HuaWeiBuilder, v 0.1 2019年12月09日 5:42 PM lisy Exp $
 */
public class HuaWeiBuilder implements IBuilderComputer {

    @Override
    public BrandEntity builderBrand() {
        return new BrandEntity("Hua Wei!");
    }

    @Override
    public ColorEntity builderColor() {
        return new ColorEntity("Black colors");
    }

    @Override
    public CpuEntity builderCpu() {
        return new CpuEntity("i3");
    }
}
