package com.raft;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: lisy
 * @version: : RaftConfig , v0.1 2020年05月25日 3:48 下午
 * @remark: the RaftConfig is
 */
public class RaftConfig {

    private String ip;

    private int port;

    /**
     * 集群列表
     */
    private ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

    public void load(){
        map.put("127.0.0.1",2181);
        map.put("127.0.0.1",2182);
        map.put("127.0.0.1",2183);
        this.ip = "127.0.0.1";
        this.port = 2181;
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ConcurrentHashMap<String, Integer> getMap() {
        return map;
    }

    public void setMap(ConcurrentHashMap<String, Integer> map) {
        this.map = map;
    }
}
