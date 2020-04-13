package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.RequestInfo;

/**
 * @author: lisy
 * @version: : MetricsCollector , v0.1 2020年04月13日 10:48 上午
 * @remark: the MetricsCollector is 一个空的实现，只是为了代码没有错误
 */
public class MetricsCollector {

    public void  recordRequest(RequestInfo requestInfo){
        System.out.println(requestInfo.toString());
    }
}

