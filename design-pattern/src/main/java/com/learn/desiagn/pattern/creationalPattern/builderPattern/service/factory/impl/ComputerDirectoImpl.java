package com.learn.desiagn.pattern.creationalPattern.builderPattern.service.factory.impl;

import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.BrandEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.ColorEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.ComputerEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.entity.CpuEntity;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.service.IBuilderComputer;
import com.learn.desiagn.pattern.creationalPattern.builderPattern.service.factory.IBuilderDirecto;

/**
 * @author : lisy
 * @version $Id: AppleComputer, v 0.1 2019年12月09日 5:25 PM lisy Exp $
 */
public class ComputerDirectoImpl implements IBuilderDirecto {

    private IBuilderComputer builderComputer;

    public ComputerDirectoImpl(IBuilderComputer builderComputer){
        this.builderComputer = builderComputer;
    }

    @Override
    public ComputerEntity createComputer() {
        BrandEntity brand = builderComputer.builderBrand();
        ColorEntity color = builderComputer.builderColor();
        CpuEntity cpu = builderComputer.builderCpu();
        ComputerEntity computer = new ComputerEntity();
        computer.setBrand(brand);
        computer.setColor(color);
        computer.setCpu(cpu);

        return computer;
    }
}
