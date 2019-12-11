package com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.Command;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.command.LightReceiver;

/**
 * @author : lisy
 * @version $Id: LightOnCommand, v 0.1 2019年12月11日 4:01 PM lisy Exp $
 */
public class LightOnCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }
}
