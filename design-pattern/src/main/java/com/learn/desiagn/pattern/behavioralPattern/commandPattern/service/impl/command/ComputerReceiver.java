package com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.command;

/**
 * @author : lisy
 * @version $Id: CloseReceiver, v 0.1 2019年12月11日 3:36 PM lisy Exp $
 */
public class ComputerReceiver {

    public void open(){
        System.out.println("开机");
    }

    public void close(){
        System.out.println("关机");
    }
}
