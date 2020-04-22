//package com.dis.lock.redis;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
// * @author: lisy
// * @version: : JedisConfiguration , v0.1 2020年04月14日 11:49 上午
// * @remark: the JedisConfiguration is 这段咱不需要
// */
//@Configuration
//public class JedisConfiguration {
//
//    private final static Logger LOGGER = LoggerFactory.getLogger(JedisConfiguration.class);
//
//    @Value("${spring.redis.host}")
//    private String host;
//
//    @Value("${spring.redis.port}")
//    private int port;
//
//    @Value("${spring.redis.jedis.pool.max-idle}")
//    private int maxIdle;
//
//    @Value("${spring.redis.jedis.pool.min-idle}")
//    private int minIdle;
//
//    @Value("${spring.redis.jedis.pool.max-active}")
//    private int maxActive;
//
//    @Value("${spring.redis.jedis.pool.max-wait}")
//    private int maxWait;
//
//    @Bean
//    public JedisPool getJedisPool(){
//        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxIdle(maxIdle);
//        config.setMinIdle(minIdle);
//        config.setMaxWaitMillis(maxWait);
//        /**
//         * 连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
//         */
//        config.setBlockWhenExhausted(false);
//        /**
//         * 是否启用pool的jmx管理功能, 默认true
//         */
//        config.setJmxEnabled(true);
//        JedisPool jedisPool = new JedisPool(config , host , port);
//        return jedisPool;
//    }
//
//
//
//
//}
