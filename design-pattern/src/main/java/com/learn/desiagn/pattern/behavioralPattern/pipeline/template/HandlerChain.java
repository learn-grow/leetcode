package com.learn.desiagn.pattern.behavioralPattern.pipeline.template;

/**
 * @author: lisy
 * @version: : HandlerChain , v0.1 2020年05月06日 1:42 下午
 * @remark: the HandlerChain is
 */
public class HandlerChain {

    private Handler head = null;

    private Handler tail = null;

    public void addHandler(Handler handler){
        handler.setSuccessor(null);
        if (head == null){
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle(){
        if (head != null){
            head.handle();
        }
    }
}
