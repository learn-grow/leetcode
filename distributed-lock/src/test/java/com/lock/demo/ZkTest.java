package com.lock.demo;

import com.dis.lock.DistributedLockApplication;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.data.Stat;
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


    @Test
    public void addKey(){

    }

    @Test
    public void testProcess() throws KeeperException, InterruptedException {

    }
}
