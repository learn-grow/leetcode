package com.learn.desiagn.pattern.behavioralPattern.commandPattern.service;

/**
 * @author : lisy
 * @version $Id: Invoker, v 0.1 2019年12月11日 4:06 PM lisy Exp $
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
