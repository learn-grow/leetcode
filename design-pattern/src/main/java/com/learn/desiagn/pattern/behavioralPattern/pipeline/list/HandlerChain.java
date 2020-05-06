package com.learn.desiagn.pattern.behavioralPattern.pipeline.list;

/**
 * @author: lisy
 * @version: : HandlerChain , v0.1 2020年05月06日 12:47 下午
 * @remark: the HandlerChain is
 */
public class HandlerChain {

    private Handler head = null;

    private Handler tail = null;

    public void addHandler(Handler handler){
        handler.setHandler(null);
        if (head == null){
            head = handler;
            tail = handler;
            return;
        }
        tail.setHandler(handler);
        tail = handler;
    }

    public void handle(){
        if (head != null){
            head.handle();
        }
    }
}
