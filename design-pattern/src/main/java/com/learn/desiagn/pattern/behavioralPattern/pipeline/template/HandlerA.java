package com.learn.desiagn.pattern.behavioralPattern.pipeline.template;

/**
 * @author: lisy
 * @version: : HandlerA , v0.1 2020年05月06日 1:40 下午
 * @remark: the HandlerA is
 */
public class HandlerA extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("this is template a");
        return handled;
    }
}
