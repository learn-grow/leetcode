package com.discovery.register.demo;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;

import java.util.List;

/**
 * @author: lisy
 * @version: : DemoTest , v0.1 2020年06月07日 11:39 上午
 * @remark: the DemoTest is
 */
public class DemoTest {


    public static void main(String[] args) throws InterruptedException {
        ZkClient zkClient = new ZkClient("127.0.0.1:2181");
        zkClient.setZkSerializer(new MyZkSerializer());
        watchZk(zkClient);
        ZkConfig.zkConfigZnode(zkClient);
        ZkConfig.zkConfigFileZnode(zkClient);
        ZkConfig.getZkConfig(zkClient);
        Thread.sleep(Integer.MAX_VALUE);
    }


    public static void watchZk(ZkClient zkClient){
        zkClient.subscribeDataChanges("/test",new IZkDataListener(){

            @Override
            public void handleDataChange(String s, Object o) throws Exception {
                System.out.println("节点数据变化" + o);
            }

            @Override
            public void handleDataDeleted(String s) throws Exception {
                System.out.println("收到节点被删除");
            }
        });

    }


}
