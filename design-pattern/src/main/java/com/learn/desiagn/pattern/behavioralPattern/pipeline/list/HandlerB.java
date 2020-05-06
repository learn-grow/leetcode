package com.learn.desiagn.pattern.behavioralPattern.pipeline.list;

/**
 * @author: lisy
 * @version: : HandlerB , v0.1 2020年05月06日 12:46 下午
 * @remark: the HandlerB is
 */
public class HandlerB extends Handler {

    @Override
    public void handle() {
        System.out.println("b");
        boolean handled = false;
        if (!handled && successor != null){
            successor.handle();
        }
    }
}
