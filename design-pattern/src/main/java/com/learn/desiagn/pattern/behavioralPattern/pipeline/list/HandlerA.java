package com.learn.desiagn.pattern.behavioralPattern.pipeline.list;

/**
 * @author: lisy
 * @version: : HandlerA , v0.1 2020年05月06日 12:43 下午
 * @remark: the HandlerA is
 */
public class HandlerA extends Handler {

    @Override
    public void handle() {
        System.out.println("a");
        boolean hanled = false;
        if (!hanled && successor != null){
            successor.handle();
        }
    }
}
