package com.dis.lock.zk;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: lisy
 * @version: : ZkWatcher , v0.1 2020年04月14日 7:27 下午
 * @remark: the ZkWatcher is
 */
@Component
public class ZkWatcher{

    @Autowired
    ZooKeeper zooKeeper;

    public String doProcess(final String path, final Stat stat) throws KeeperException, InterruptedException {

        Watcher watcher = new Watcher() {

            @Override
            public void process(WatchedEvent event) {
                try {
                    String innerResult = doProcess(path,stat);
                    String[] addressArray = innerResult.split(",");
                    for (String address : addressArray) {
                        System.err.println("ping " + address);
                    }
                } catch (KeeperException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        byte[] data = zooKeeper.getData(path, watcher, stat);
        return new String(data);
    }

}
