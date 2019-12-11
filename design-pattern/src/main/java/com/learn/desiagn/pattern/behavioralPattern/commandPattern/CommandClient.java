package com.learn.desiagn.pattern.behavioralPattern.commandPattern;

import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.Command;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.Invoker;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.ComputerCloseCommand;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.ComputerOpenCommand;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.LightOffCommand;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.LightOnCommand;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.command.ComputerReceiver;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.command.LightReceiver;

/**
 * @author : lisy
 * @version $Id: CommandClient, v 0.1 2019年12月11日 3:35 PM lisy Exp $
 */
public class CommandClient {


    public static void main(String args[]){

        ComputerReceiver computerReceiver = new ComputerReceiver();
        LightReceiver lightReceiver = new LightReceiver();

        Command computerOpen = new ComputerOpenCommand(computerReceiver);
        Command computerClose = new ComputerCloseCommand(computerReceiver);

        Command lightOn = new LightOnCommand(lightReceiver);
        Command lightOff = new LightOffCommand(lightReceiver);

        Invoker invoker = new Invoker(computerOpen);
        invoker.execute();
        invoker = new Invoker(computerClose);
        invoker.execute();
        invoker = new Invoker(lightOn);
        invoker.execute();
        invoker = new Invoker(lightOff);
        invoker.execute();

    }
}
