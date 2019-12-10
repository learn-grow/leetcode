package com.learn.desiagn.pattern.structuralPattern.adapterPattern.classAdapter.service.impl;


import com.learn.desiagn.pattern.structuralPattern.adapterPattern.classAdapter.service.Adaptee;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.classAdapter.service.Target;

/**
 * @author : lisy
 * @version $Id: ClassAdapter, v 0.1 2019年12月10日 4:44 PM lisy Exp $
 * 类适配器 具体的实现
 */
public class ClassAdapter extends Adaptee implements Target {


    @Override
    public void request() {
        specificRequest();
    }
}
