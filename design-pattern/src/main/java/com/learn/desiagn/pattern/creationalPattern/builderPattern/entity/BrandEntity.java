package com.learn.desiagn.pattern.creationalPattern.builderPattern.entity;

/**
 * @author : lisy
 * @version $Id: BrandEntity, v 0.1 2019年12月09日 4:05 PM lisy Exp $
 */
public class BrandEntity implements Cloneable{

    private String name;

    public BrandEntity(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
