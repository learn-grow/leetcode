package com.raft.comm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : ServerInfo , v0.1 2020年05月25日 3:41 下午
 * @remark: the ServerInfo is
 */
public class ServerConfig implements Serializable {

    /**
     * 启动端口
     */
    private int port;

    /**
     * 心跳检测时间
     */
    private long tickTime;

    /**
     * 集群
     */
    private List<String> cluster = new ArrayList<>();

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getTickTime() {
        return tickTime;
    }

    public void setTickTime(long tickTime) {
        this.tickTime = tickTime;
    }

    public List<String> getCluster() {
        return cluster;
    }

    public void setCluster(List<String> cluster) {
        this.cluster = cluster;
    }

    @Override
    public String toString() {
        return "ServerConfig{" +
                "port=" + port +
                ", tickTime=" + tickTime +
                ", cluster=" + cluster +
                '}';
    }
}
