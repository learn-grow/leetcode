package com.learn.desiagn.pattern.creationalPattern.builderPattern.entity;

/**
 * @author : lisy
 * @version $Id: CpuEntity, v 0.1 2019年12月09日 4:03 PM lisy Exp $
 */
public class CpuEntity implements Cloneable {

    private String name;

    public CpuEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
