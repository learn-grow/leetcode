package com.learn.desiagn.pattern.creationalPattern.builderPattern.entity;

/**
 * @author : lisy
 * @version $Id: ColorEntity, v 0.1 2019年12月09日 4:04 PM lisy Exp $
 */
public class ColorEntity implements Cloneable{

    private String name;

    public ColorEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
