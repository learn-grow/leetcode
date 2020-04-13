package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.dynameicProxy;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.MetricsCollector;
import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.RequestInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: lisy
 * @version: : DynamicProxyHandler , v0.1 2020年04月13日 5:48 下午
 * @remark: the DynamicProxyHandler is
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxyObject;

    private MetricsCollector metricsCollector = new MetricsCollector();

    public DynamicProxyHandler(Object proxyObject){
        this.proxyObject = proxyObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始");
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(proxyObject , args);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        String apiName = proxyObject.getClass().getSimpleName() + ":" + method.getName();
        RequestInfo requestInfo = new RequestInfo(apiName , responseTime , startTime);
        metricsCollector.recordRequest(requestInfo);
        System.out.println("end");
        return result;
    }
}
