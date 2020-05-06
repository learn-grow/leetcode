package com.learn.desiagn.pattern.behavioralPattern.pipeline.template;

/**
 * @author: lisy
 * @version: : Handler , v0.1 2020年05月06日 1:36 下午
 * @remark: the Handler is
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public final void handle(){
        boolean handled = doHandle();
        if (!handled && successor != null){
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
