package com.learn.desiagn.pattern.creationalPattern.prototypePattern.entity;

/**
 * @author : lisy
 * @version $Id: Sheep, v 0.1 2019年12月09日 7:18 PM lisy Exp $
 */
public class Sheep1 implements Cloneable {

    /**
     * 名称
     */
    private String name;

    /**
     * 颜色
     */
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep1() {
    }

    public Sheep1(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
