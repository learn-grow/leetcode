package com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.Command;
import com.learn.desiagn.pattern.behavioralPattern.commandPattern.service.impl.command.ComputerReceiver;

/**
 * @author : lisy
 * @version $Id: ComputerCommand, v 0.1 2019年12月11日 3:58 PM lisy Exp $
 */
public class ComputerCloseCommand implements Command{

    private ComputerReceiver computerReceiver;

    public ComputerCloseCommand(ComputerReceiver computerReceiver){
        this.computerReceiver = computerReceiver;
    }

    @Override
    public void execute() {
        computerReceiver.close();
    }
}
