package com.learn.desiagn.pattern.behavioralPattern.templatePattern.template;

/**
 * @author: lisy
 * @version: : AbstractClass , v0.1 2020年04月30日 6:08 下午
 * @remark: the AbstractClass is
 */
public abstract class AbstractClass {

    public final void template(){
        method1();
        method2();
    }

    protected abstract void method1();

    protected abstract void method2();
}
