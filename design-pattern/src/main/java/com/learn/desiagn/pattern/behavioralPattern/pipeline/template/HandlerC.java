package com.learn.desiagn.pattern.behavioralPattern.pipeline.template;

import jdk.internal.org.objectweb.asm.Handle;

/**
 * @author: lisy
 * @version: : HandlerC , v0.1 2020年05月06日 1:45 下午
 * @remark: the HandlerC is
 */
public class HandlerC extends Handler {
    @Override
    protected boolean doHandle() {
        System.out.println("this is c");
        return false;
    }
}
