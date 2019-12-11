package com.learn.desiagn.pattern.structuralPattern.flyweightPattern.example.service.impl;

import com.learn.desiagn.pattern.structuralPattern.flyweightPattern.example.service.ITicket;

import java.util.Random;

/**
 * @author : lisy
 * @version $Id: TrainTicket, v 0.1 2019年12月11日 11:16 AM lisy Exp $
 */
public class TrainTicket implements ITicket {

    private String from;

    private String to;

    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(String.format("%s-->%s:%s价格：%s元", this.from, this.to, bunk, this.price));
    }
}
