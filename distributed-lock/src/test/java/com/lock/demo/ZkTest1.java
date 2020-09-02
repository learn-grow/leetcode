package com.lock.demo;

import com.alibaba.fastjson.JSON;
import com.dis.lock.DistributedLockApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: lisy
 * @version: : RedisTest , v0.1 2020年04月12日 2:34 下午
 * @remark: the RedisTest is
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DistributedLockApplication.class)
public class ZkTest1 {


    @Test
    public void addKey(){

    }
}
