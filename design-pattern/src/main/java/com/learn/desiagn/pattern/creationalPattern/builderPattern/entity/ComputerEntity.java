package com.learn.desiagn.pattern.creationalPattern.builderPattern.entity;

/**
 * @author : lisy
 * @version $Id: ComputerEntity, v 0.1 2019年12月09日 4:07 PM lisy Exp $
 */
public class ComputerEntity implements Cloneable {

    /**
     * 品牌
     */
    private BrandEntity brand;

    /**
     * 颜色
     */
    private ColorEntity color;

    /**
     * cpu 型号
     */
    private CpuEntity cpu;

    public void create() {
        System.out.println("create computer !");
    }


    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }

    public ColorEntity getColor() {
        return color;
    }

    public void setColor(ColorEntity color) {
        this.color = color;
    }

    public CpuEntity getCpu() {
        return cpu;
    }

    public void setCpu(CpuEntity cpu) {
        this.cpu = cpu;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        ComputerEntity computer = (ComputerEntity) o;
        computer.brand = (BrandEntity) this.brand.clone();
        computer.color = (ColorEntity) this.color.clone();
        computer.cpu = (CpuEntity) this.cpu.clone();
        return computer;
    }
}

