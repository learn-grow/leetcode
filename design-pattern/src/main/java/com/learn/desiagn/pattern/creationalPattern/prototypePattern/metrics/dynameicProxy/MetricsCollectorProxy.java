package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.dynameicProxy;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.MetricsCollector;
import com.sun.deploy.net.proxy.DynamicProxyManager;

import java.lang.reflect.Proxy;

/**
 * @author: lisy
 * @version: : MetricsCollectorProxy , v0.1 2020年04月13日 5:43 下午
 * @remark: the MetricsCollectorProxy is
 */
public class MetricsCollectorProxy {

    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy(){
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxyObject){
        Class<?>[] interfaces = proxyObject.getClass().getInterfaces(); //利用反射创建对象实例
        DynamicProxyHandler handler = new DynamicProxyHandler(proxyObject);
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader() , interfaces , handler);
    }
}
