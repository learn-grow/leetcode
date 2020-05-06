package com.learn.desiagn.pattern.behavioralPattern.pipeline.list;

/**
 * @author: lisy
 * @version: : Application , v0.1 2020年05月06日 12:49 下午
 * @remark: the Application is
 */
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
