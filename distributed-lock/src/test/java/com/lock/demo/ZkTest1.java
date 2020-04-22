package com.lock.demo;

import com.alibaba.fastjson.JSON;
import com.dis.lock.DistributedLockApplication;
import com.dis.lock.zk.ZkUtil;
import com.dis.lock.zk.ZkWatcher;
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
public class ZkTest1 {

    @Autowired
    ZkUtil zkUtil;

    @Autowired
    ZkWatcher zkWatcher;

    @Test
    public void addKey(){
        String[] str =
                new String[]{"192.168.1.2:6397", "192.168.1.2:6397", "192.168.2.1:6397", "192.168.2.2:6397", "192.168.3.1:6397", "192.168.3.2:6397"};
        zkUtil.updatePerNode("/hash_consistency", JSON.toJSONString(str));

    }
}
