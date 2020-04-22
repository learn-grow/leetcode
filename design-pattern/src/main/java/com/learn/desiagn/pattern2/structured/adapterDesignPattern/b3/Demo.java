package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b3;

/**
 * @author: lisy
 * @version: : Demo , v0.1 2020年04月20日 3:08 下午
 * @remark: the Demo is
 */
public class Demo {

    public static void main(String[] args) {
        IA ia = new BAdaptor(new B());
        ia.fa();
    }
}
