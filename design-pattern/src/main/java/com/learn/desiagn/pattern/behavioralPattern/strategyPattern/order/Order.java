package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.order;

/**
 * @author: lisy
 * @version: : Order , v0.1 2020年05月06日 10:44 上午
 * @remark: the Order is
 */
public class Order {

    private long id;

    private String code;

    private double price;

    private int type;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
