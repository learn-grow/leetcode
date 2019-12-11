package com.learn.desiagn.pattern.structuralPattern.flyweightPattern.example;

import com.learn.desiagn.pattern.structuralPattern.flyweightPattern.example.service.ITicket;
import com.learn.desiagn.pattern.structuralPattern.flyweightPattern.example.service.impl.TicketFactory;


/**
 * @author : lisy
 * @version $Id: Client, v 0.1 2019年12月11日 11:15 AM lisy Exp $
 */
public class Client {

    public static void main(String args[]) {
        ITicket ticket = TicketFactory.getTicket("深圳","北京");
        ticket.showInfo("站票");

        ITicket ticket1 = TicketFactory.getTicket("深圳","北京");
        ticket1.showInfo("站票");

        ITicket ticket2 = TicketFactory.getTicket("深圳","北京");
        ticket2.showInfo("站票");
    }
}
