package com.learn.desiagn.ex2.power.v2;

import com.google.common.annotations.VisibleForTesting;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: lisy
 * @version: : RedisClusterIdempotenceStorage , v0.1 2020年08月19日 11:01 上午
 * @remark: the RedisClusterIdempotenceStorage is 幂等号读写Redis的实现方式
 */
public class RedisClusterIdempotenceStorage implements IdempotenceStorage {

    private JedisCluster jedisCluster;

    /**
     * 初始化Redis连接
     * @param redisClusterAddress
     * @param config
     */
    public RedisClusterIdempotenceStorage(String redisClusterAddress , GenericObjectPoolConfig config){
        Set<HostAndPort> redisNodes = parseHostAndPorts(redisClusterAddress);
        this.jedisCluster = new JedisCluster(redisNodes , config);
    }

    @Override
    public boolean saveIfAbsent(String id) {
        Long sucess = jedisCluster.setnx(id , "1");
        return sucess == 1;
    }

    @Override
    public void delete(String id) {
        jedisCluster.del(id);
    }


    @VisibleForTesting
    private Set<HostAndPort> parseHostAndPorts(String redisClusterAddress) {
        String[] addressArray = redisClusterAddress.split(";");
        Set<HostAndPort> redisNodes = new HashSet<>();
        for (String address : addressArray) {
            String[] hostAndPort = address.split(":");
            redisNodes.add(new HostAndPort(hostAndPort[0] , Integer.valueOf(hostAndPort[1])));
        }
        return redisNodes;
    }
}
