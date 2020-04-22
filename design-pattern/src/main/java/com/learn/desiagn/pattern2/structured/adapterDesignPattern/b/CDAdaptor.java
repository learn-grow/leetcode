package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b;

/**
 * @author: lisy
 * @version: : CDAdaptor , v0.1 2020年04月20日 2:28 下午
 * @remark: the CDAdaptor is
 * 1. 封装有缺陷的接口设计
 * 假设我们依赖的外部系统在接口设计方面有缺陷（比如包含大量静态方法），
 * 引入之后会影响到我们自身代码的可测试性。
 * 为了隔离设计上的缺陷，我们希望对外部系统提供的接口进行二次封装，
 * 抽象出更好的接口设计，这个时候就可以使用适配器模式了。
 */
public class CDAdaptor extends CD implements ITarget {

    @Override
    public void function1() {
        super.staticFunction1();
    }

    @Override
    public void function2() {
        super.uglyNamingFunction2();
    }

    @Override
    public void function3(int paramA) {
        super.tooManyParamsFunction3(paramA ,paramA);
    }

    @Override
    public void function4() {
        super.lowPerformanceFunction4();
    }
}
