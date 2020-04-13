package com.lock.demo;

import com.dis.lock.DistributedLockApplication;
import com.dis.lock.locks.ZkLock;
import com.dis.lock.redis.RedisUtil;
import com.dis.lock.zk.ZKUtil;
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
public class ZkTest {

    @Autowired
    ZkLock zkLock;

    @Test
    public void addKey(){
        zkLock = new ZkLock("user_1");
        zkLock.lock(100);
        zkLock.unlock();
    }
}
