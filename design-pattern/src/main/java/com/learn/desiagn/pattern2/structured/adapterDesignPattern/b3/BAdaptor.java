package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b3;

/**
 * @author: lisy
 * @version: : BAdaptor , v0.1 2020年04月20日 3:08 下午
 * @remark: the BAdaptor is
 */
public class BAdaptor implements IA {

    private B b;
    public BAdaptor(B b){
        this.b = b;
    }

    @Override
    public void fa() {
        b.fb();
    }
}
