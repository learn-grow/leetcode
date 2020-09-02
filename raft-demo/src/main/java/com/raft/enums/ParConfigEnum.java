package com.raft.enums;

/**
 * @author: lisy
 * @version: : ParConfig , v0.1 2020年05月25日 5:09 下午
 * @remark: the ParConfig is
 */
public enum ParConfigEnum {

    SERVER("server"),

    PORT("port"),

    TICKTIME("tickTime"),

    CLUSTER("cluster"),

    CLUSTERS("clusters");

    private String code;

    ParConfigEnum(String code){
        this.code = code;
    }

    public String code() {
        return code;
    }
}
