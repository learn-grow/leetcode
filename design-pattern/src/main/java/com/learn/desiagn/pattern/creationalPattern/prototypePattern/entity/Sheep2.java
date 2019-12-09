package com.learn.desiagn.pattern.creationalPattern.prototypePattern.entity;

import java.util.Date;

/**
 * @author : lisy
 * @version $Id: Sheep, v 0.1 2019年12月09日 7:18 PM lisy Exp $
 */
public class Sheep2 implements Cloneable {

    /**
     * 名称
     */
    private String name;

    /**
     * 颜色
     */
    private String color;

    private Date date;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Sheep2() {
    }

    public Sheep2(String name, String color, Date date) {
        this.name = name;
        this.color = color;
        this.date = date;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        Sheep2 sheep2 = (Sheep2) o;
        sheep2.date = (Date) this.date.clone();
        return o;
    }
}
