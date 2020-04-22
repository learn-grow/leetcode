package com.learn.desiagn.pattern2.structured.adapterDesignPattern.a;

/**
 * @author: lisy
 * @version: : Adaptor , v0.1 2020年04月20日 1:37 下午
 * @remark: the Adaptor is 基于继承的适配器模式
 */
public class Adaptor1 extends Adaptee implements ITarget {

    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        /**
         * fb 可以重新去做实现
         */
        if (1 == 1){
            super.fb();
        }else{
            System.out.println("1");
        }
    }

    @Override
    public void f3() {
        System.out.println(3);
    }
}
