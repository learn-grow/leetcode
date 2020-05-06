package com.learn.desiagn.pattern.behavioralPattern.pipeline.template;

import jdk.internal.org.objectweb.asm.Handle;

/**
 * @author: lisy
 * @version: : HandlerB , v0.1 2020年05月06日 1:40 下午
 * @remark: the HandlerB is
 */
public class HandlerB extends Handler {
    @Override
    protected boolean doHandle() {
        boolean heandled = false;
        System.out.println("this is template b");
        return heandled;
    }
}
