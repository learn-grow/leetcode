package com.learn.desiagn.pattern.behavioralPattern.pipeline.list;

/**
 * @author: lisy
 * @version: : Handler , v0.1 2020年05月06日 12:41 下午
 * @remark: the Handler is 处理类的抽象父类
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setHandler(Handler successor){
        this.successor = successor;
    }

    public abstract void  handle();
}
