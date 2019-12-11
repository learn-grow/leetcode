package com.learn.desiagn.pattern.behavioralPattern.templatePattern.service;

/**
 * @author : lisy
 * @version $Id: AbstractTemplate, v 0.1 2019年12月11日 3:11 PM lisy Exp $
 */
public abstract class AbstractTemplate {


    public final void template() {
        //初始化
        specificInit();
        //拉取
        add();
        //执行
        specificPre();
        //清理
        if (isFlag()) {
            clear();
        }

    }

    protected boolean isFlag() {
        return true;
    }

    private void specificInit() {
        System.out.println("初始化环境");
    }

    private void specificPre() {
        System.out.println("执行");
    }

    /**
     * 抽象方法
     */
    public abstract void add();

    public abstract void clear();
}
