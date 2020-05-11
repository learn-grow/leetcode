package com.learn.leetcode.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: lisy
 * @version: : MyInvocationHandler , v0.1 2020年05月09日 1:48 下午
 * @remark: the MyInvocationHandler is
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }

    /**
     * 字节码增加
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invo say hello");
        Object result = method.invoke(target , args);
        System.out.println("this is invo end");
        return result;
    }
}
