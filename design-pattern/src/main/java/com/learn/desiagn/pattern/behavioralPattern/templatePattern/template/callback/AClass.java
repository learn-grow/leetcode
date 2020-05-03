package com.learn.desiagn.pattern.behavioralPattern.templatePattern.template.callback;

import com.learn.desiagn.pattern2.structured.adapterDesignPattern.b3.B;

/**
 * @author: lisy
 * @version: : AClass , v0.1 2020年04月30日 6:26 下午
 * @remark: the AClass is
 */
public class AClass {

    public static void main(String[] args) {
        BClass b = new BClass();
        b.process(new ICallBack() {
            @Override
            public void methodToCallback() {
                System.out.println("call back me");
            }
        });
    }
}
