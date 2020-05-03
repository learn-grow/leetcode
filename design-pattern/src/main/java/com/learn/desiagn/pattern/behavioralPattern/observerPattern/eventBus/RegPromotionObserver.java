package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus;

/**
 * @author: lisy
 * @version: : RegPromotionObserver , v0.1 2020年04月30日 2:09 下午
 * @remark: the RegPromotionObserver is
 */
public class RegPromotionObserver implements RegObserver {

    /**
     * object-observer异步的第一种实现方式，新开线程
     * @param userId
     */
    @Override
    public void handlerRegSucess(long userId) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread to do the job");
            }
        });
        thread.start();

    }
}
