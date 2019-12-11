package com.learn.desiagn.pattern.behavioralPattern.templatePattern.service.impl;

import com.learn.desiagn.pattern.behavioralPattern.templatePattern.service.AbstractTemplate;

/**
 * @author : lisy
 * @version $Id: Python, v 0.1 2019年12月11日 3:18 PM lisy Exp $
 */
public class PythonImpl extends AbstractTemplate {
    @Override
    public void add() {
        System.out.println("读取python执行文件");
    }

    @Override
    public void clear() {
        System.out.println("Python 程序清理");
    }
}
