package com.dis.lock.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author: lisy
 * @version: : RedisUtil , v0.1 2020年04月10日 5:32 下午
 * @remark: the RedisUtil is
 */
@Component
public class RedisUtil {

    private static final Logger logger =  LoggerFactory.getLogger(RedisUtil.class);

    @Autowired
    private RedisTemplate<String , Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource(name = "redis.setnx")
    private RedisScript<Boolean> redisScriptSetnx;

    @Resource(name = "redis.del")
    private RedisScript<Boolean> redisScriptDel;

    private static TimeUnit TIMEUNIT = TimeUnit.MICROSECONDS;

    /**
     * 指定key的失效时间
     * @param key
     * @param time
     * @return
     */
    public boolean expier(String key , long time){
        try{
            if (time > 0){
                redisTemplate.expire(key, time, TIMEUNIT);
                return true;
            }
        }catch (Exception e){
            logger.info("set redis expier error:{}" , e);
            return false;
        }
        return false;
    }

    /**
     * 获取key的过期时间
     * @param key
     * @return
     */
    public long getExpier(String key){
        return redisTemplate.getExpire(key, TIMEUNIT);
    }

    /**
     * 判断key 是否存在
     * @param key
     * @return
     */
    public boolean hashKey(String key){
        try {
            return redisTemplate.hasKey(key);
        }catch (Exception e){
            logger.info("get redis hashkey error:{}" , e);
            return false;
        }
    }

    /**
     * 获取缓存
     * @param key
     * @return
     */
    public Object get(String key){
        return  key == null ? null : redisTemplate.opsForValue().get(key);
    }

    public boolean set(String key , Object value){
        try{
            redisTemplate.opsForValue().set(key , value);
            return true;
        }catch (Exception e){
            logger.info("set redis error :{}", e);
        }
        return true;
    }

    /**
     * lua脚本操作 setnx
     * @param key
     * @param val
     * @param expier
     * @return
     */
    public Boolean setnx(String key , String val , long expier){
        List<String> list = Arrays.asList(key , val);
        return stringRedisTemplate.execute(redisScriptSetnx, list, expier);
    }

    /**
     * lua脚本删除key
     * @param key
     * @return
     */
    public Boolean del(String key){
        List<String> list = Arrays.asList(key);
        return stringRedisTemplate.execute(redisScriptDel, list);
    }
}
