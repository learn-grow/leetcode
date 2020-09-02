package com.learn.desiagn.ex2.power.v1;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author: lisy
 * @version: : Idempotence , v0.1 2020年08月19日 10:48 上午
 * @remark: the Idempotence is 幂等框架
 */
public class Idempotence {

    private JedisCluster jedisCluster;

    public Idempotence(String redisClusterAddress , GenericObjectPoolConfig config){
        String[] addresArry = redisClusterAddress.split(";");
        Set<HostAndPort> redisNodes = new HashSet<>();
        for (String addre : addresArry) {
            String[] hostAndPort = addre.split(":");
            redisNodes.add(new HostAndPort(hostAndPort[0] , Integer.valueOf(hostAndPort[1])));
        }
        this.jedisCluster = new JedisCluster(redisNodes , config);
    }

    /**
     * 获取幂等号 v1 版本中以 uuid的生成方式
     * @return
     */
    public String generateId(){
        return UUID.randomUUID().toString();
    }

    /**
     * 判断 幂等号是否存在
     * @param id
     * @return
     */
    public boolean saveIdNx(String id){
        long success = jedisCluster.setnx(id , "1");
        return success == 1;
    }

    /**
     * 删除幂等号
     * @param id
     */
    public void deleteId(String id){
        jedisCluster.del(id);
    }
}
