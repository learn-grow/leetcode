package com.learn.desiagn.pattern.behavioralPattern.chainOfResponsibility.service;

/**
 * @author : lisy
 * @version $Id: Handler, v 0.1 2019年12月12日 3:45 PM lisy Exp $
 */
public abstract class Handler {

    private Handler next;

    public void setHandler(Handler handler){
        this.next = handler;
    }

    public Handler getNext() {
        return next;
    }


    public abstract void handlerRequest(String request);

}
