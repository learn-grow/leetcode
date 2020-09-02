package com.discovery.register.demo;

import org.I0Itec.zkclient.ZkClient;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author: lisy
 * @version: : ZkConfig , v0.1 2020年06月07日 5:39 下午
 * @remark: the ZkConfig is 配置中心的实现
 */
public class ZkConfig {

    /**
     * 一个配置项作为一个znode ，
     * @param client
     */
    public static void zkConfigZnode(ZkClient client){
        String path = "/daata-config";
        if (client.exists(path)){
            client.writeData(path,"10");
        }else{
            client.createPersistent(path , "10");
        }
    }

    /**
     * 将配置文件作为一个znode 存储
     * @param client
     */
    public static void zkConfigFileZnode(ZkClient client){
        File file = new File("/Users/lishaoyong/code-cn/my/leetcode/service-discovery-register/src/main/resources/config.properties");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] datas = new byte[(int) file.length()];
            fileInputStream.read(datas);
            fileInputStream.close();
            String path = "/config-file";
            if (client.exists(path)){
                client.writeData(path , datas);
            }else{
                client.createPersistent(path ,datas);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getZkConfig(ZkClient zkClient){

        String path = "/daata-config";

        String data = zkClient.readData(path);

        System.out.println(data);
    }
}
