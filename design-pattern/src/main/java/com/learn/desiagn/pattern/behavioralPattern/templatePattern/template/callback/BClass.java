package com.learn.desiagn.pattern.behavioralPattern.templatePattern.template.callback;

/**
 * @author: lisy
 * @version: : BClass , v0.1 2020年04月30日 6:26 下午
 * @remark: the BClass is
 */
public class BClass {

    public void process(ICallBack callBack){
        System.out.println("bbb");
        callBack.methodToCallback();
    }
}
