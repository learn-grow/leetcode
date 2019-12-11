package com.learn.desiagn.pattern.structuralPattern.flyweightPattern.example.service.impl;

import com.learn.desiagn.pattern.structuralPattern.flyweightPattern.example.service.ITicket;

import java.util.HashMap;

/**
 * @author : lisy
 * @version $Id: TicketFactory, v 0.1 2019年12月11日 11:20 AM lisy Exp $
 */
public class TicketFactory {

    private static HashMap<String, ITicket> pool = new HashMap<>();

    public static ITicket getTicket(String from, String to) {
        String key = from + "->" + to;
        if (TicketFactory.pool.containsKey(key)) {
            System.out.println("使用缓存=>" + key);
            return TicketFactory.pool.get(key);
        }

        System.out.println("第一次查询,创建对象->" + key);
        ITicket ticket = new TrainTicket(from, to);
        TicketFactory.pool.put(key, ticket);
        return ticket;
    }
}
