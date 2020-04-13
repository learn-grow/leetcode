package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity;

/**
 * @author: lisy
 * @version: : RequestInfo , v0.1 2020年04月13日 10:58 上午
 * @remark: the RequestInfo is
 */
public class RequestInfo {

    private String methodName;

    private long startTime;

    private long endTime;


    public RequestInfo(String methodName , long startTime ,long endTime){
        this.methodName = methodName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "RequestInfo{" +
                "methodName='" + methodName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
