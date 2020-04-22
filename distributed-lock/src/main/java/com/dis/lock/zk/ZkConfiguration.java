package com.dis.lock.zk;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author: lisy
 * @version: : ZookeeperConfiguration , v0.1 2020年04月10日 6:29 下午
 * @remark: the ZookeeperConfiguration is 连接zk server
 */
@Configuration
public class ZkConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(ZkConfiguration.class);

    @Value("${zookeeper.host}")
    private String zkHost;

    @Value("${zookeeper.timeout}")
    private int timeout;

    @Bean
    public ZooKeeper zkClient(){
        ZooKeeper zooKeeper = null ;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            zooKeeper = new ZooKeeper(zkHost, timeout, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {
                    if (Event.KeeperState.SyncConnected == watchedEvent.getState()){
                        countDownLatch.countDown();
                    }
                }
            });
            countDownLatch.await();
            logger.info("zk start state:{}" , zooKeeper.getState());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            logger.info("zk start erro:{}" , e);
        }
        return zooKeeper;
    }


}
