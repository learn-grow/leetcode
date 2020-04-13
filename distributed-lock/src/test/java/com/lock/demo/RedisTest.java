package com.lock.demo;

import com.dis.lock.DistributedLockApplication;
import com.dis.lock.redis.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: lisy
 * @version: : RedisTest , v0.1 2020年04月12日 2:34 下午
 * @remark: the RedisTest is
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DistributedLockApplication.class)
public class RedisTest {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void addKey(){
        redisUtil.set("k_test",1);
        System.out.println("获取redis key k_test ,v :" + redisUtil.get("k_test"));
    }
}
