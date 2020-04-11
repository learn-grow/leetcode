package com.dis.lock.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

/**
 * @author: lisy
 * @version: : LuaConfiguration , v0.1 2020年04月10日 6:10 下午
 * @remark: the LuaConfiguration is
 */
@Configuration
public class LuaConfiguration {

    @Bean(name = "redis.setnx")
    public DefaultRedisScript<Boolean> redisScriptSetnx(){
        DefaultRedisScript<Boolean> redisScript = new DefaultRedisScript<>();
        redisScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("script/setnx.lua")));
        redisScript.setResultType(Boolean.class);
        return redisScript;
    }

    @Bean(name = "redis.del")
    public DefaultRedisScript<Boolean> redisScriptDel(){
        DefaultRedisScript<Boolean> redisScript = new DefaultRedisScript<>();
        redisScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("script/del.lua")));
        redisScript.setResultType(Boolean.class);
        return redisScript;
    }
}
