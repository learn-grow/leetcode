package com.discovery.register.demo;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.exception.ZkNodeExistsException;

import java.util.concurrent.CountDownLatch;

/**
 * @author: lisy
 * @version: : Server , v0.1 2020年06月07日 6:18 下午
 * @remark: the Server is 主从选举的实现
 */
public class Server {

    private String cluster, name, address;

    private String path = null;
    private String val = null;

    private String master;

    public Server(String cluster , String name, String address, ZkClient zkClient){
        super();
        this.cluster = cluster;
        this.name = name;
        this.address = address;
        path = "/" + this.cluster + "master";
        val = "name:" + name + " address:" + address;
        new Thread(new Runnable() {
            @Override
            public void run() {
                electionMaster(zkClient);
            }
        }).start();
    }


    public void electionMaster(ZkClient client){
        try{
            client.createEphemeral(path , val);
            master = client.readData(path);
            System.out.println("创建节点成功，成为主节点");
        }catch (ZkNodeExistsException e){
            master = client.readData(path);
            System.out.println("master :" + master);
        }

        CountDownLatch countDownLatch = new CountDownLatch(1);
        IZkDataListener listener = new IZkDataListener() {
            @Override
            public void handleDataChange(String s, Object o) throws Exception {

            }

            @Override
            public void handleDataDeleted(String s) throws Exception {
                System.out.println("节点被删除");
                countDownLatch.countDown();
            }
        };

        client.subscribeDataChanges(path , listener);
        if (client.exists(path)){ //如果节点存在，则去阻塞
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        client.unsubscribeDataChanges(path , listener);
        electionMaster(client); //递归调用下一次
    }

    public static void main(String[] args) {
        ZkClient zkClient = new ZkClient("127.0.0.1:2181");
        zkClient.setZkSerializer(new MyZkSerializer());
        //Server server = new Server("cluter1","service1","192:123",zkClient);
        // Server server = new Server("cluter1","service1","193:123",zkClient);
        //Server server = new Server("cluter1","service1","194:123",zkClient);
        Server server = new Server("cluter1","service1","195:123",zkClient);

    }
}
