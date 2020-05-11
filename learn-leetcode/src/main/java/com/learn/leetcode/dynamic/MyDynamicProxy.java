package com.learn.leetcode.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author: lisy
 * @version: : MyDynamicProxy , v0.1 2020年05月09日 1:46 下午
 * @remark: the MyDynamicProxy is
 */
public class MyDynamicProxy {

    public static void main(String[] args) {
        HelloImpl hello = new HelloImpl();

        MyInvocationHandler handler = new MyInvocationHandler(hello);
        Hello proxyHello = (Hello) Proxy.newProxyInstance( //代理类
                HelloImpl.class.getClassLoader(),
                HelloImpl.class.getInterfaces(),
                handler);

        proxyHello.sayHello();
    }
}
