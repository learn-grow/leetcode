package com.learn.desiagn.pattern.creationalPattern.builderPattern.service.impl;

import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.BrandEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.ColorEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.CpuEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.service.IBuilderComputer;

/**
 * @author : lisy
 * @version $Id: AppleBuilder, v 0.1 2019年12月09日 5:29 PM lisy Exp $
 * 独立的建造者 builder Apple
 */
public class AppleBuilder implements IBuilderComputer {

    private BrandEntity brandEntity;

    private ColorEntity colorEntity;

    private CpuEntity cpuEntity;


    @Override
    public BrandEntity builderBrand() {
        return new BrandEntity("apple");
    }

    @Override
    public ColorEntity builderColor() {
        return new ColorEntity("golden");
    }

    @Override
    public CpuEntity builderCpu() {
        return new CpuEntity("i7 四核");
    }

}
