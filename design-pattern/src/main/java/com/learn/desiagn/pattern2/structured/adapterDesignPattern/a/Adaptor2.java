package com.learn.desiagn.pattern2.structured.adapterDesignPattern.a;

/**
 * @author: lisy
 * @version: : Adaptor , v0.1 2020年04月20日 1:37 下午
 * @remark: the Adaptor is 基于组合的适配器模式
 */
public class Adaptor2 implements ITarget {

    private Adaptee adaptee;

    public Adaptor2(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa(); //委托给 adaptee.fa()
    }

    @Override
    public void f2() {
        /**
         * fb 可以重新去做实现
         */
        if (1 == 1){
            adaptee.fb();
        }else{
            System.out.println("1");
        }
    }

    @Override
    public void f3() {
        System.out.println(3);
    }
}
