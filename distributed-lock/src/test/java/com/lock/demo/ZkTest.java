package com.lock.demo;

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
public class ZkTest {

    @Autowired
    ZkUtil zkUtil;

    @Autowired
    ZkWatcher zkWatcher;

    @Test
    public void addKey(){
        boolean stat = zkUtil.exists("/hash_consistency",false);
        if (!stat){
//            String[] str =
//                    new String[]{"192.168.1.1:6397", "192.168.1.2:6397", "192.168.2.1:6397", "192.168.2.2:6397", "192.168.3.1:6397", "192.168.3.2:6397"};
//            zkUtil.createPerNode("/hash_consistency", JSON.toJSONString(str));

        }
        String str = zkUtil.getData("/hash_consistency", new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                watchedEvent.getState();
            }
        });
        System.out.println(str);
        System.out.println("--------" + stat);
    }

    @Test
    public void testProcess() throws KeeperException, InterruptedException {
        Stat stat = new Stat();

        String path = "/hash_consistency";

        String initResult = zkWatcher.doProcess(path, stat);
        System.err.println("initResult ==> " + initResult);

        while(true) {
            Thread.sleep(5000);
            System.err.println("我还活着呢！！！！！");
        }
    }
}
