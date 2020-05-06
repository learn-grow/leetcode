package com.learn.desiagn.pattern.behavioralPattern.pipeline.template;

/**
 * @author: lisy
 * @version: : Appaction , v0.1 2020年05月06日 1:45 下午
 * @remark: the Appaction is
 */
public class Appaction {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerC());
        chain.handle();
    }
}
