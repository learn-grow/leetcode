package com.learn.desiagn.pattern.behavioralPattern.templatePattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.templatePattern.service.AbstractTemplate;

/**
 * @author : lisy
 * @version $Id: JavaImpl, v 0.1 2019年12月11日 3:14 PM lisy Exp $
 */
public class JavaImpl extends AbstractTemplate{


    @Override
    public void add() {
        System.out.println("javac 编译源文件");
    }

    @Override
    public void clear() {
        System.out.println("java 程序清理");
    }
}
