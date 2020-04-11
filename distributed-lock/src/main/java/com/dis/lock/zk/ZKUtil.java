package com.dis.lock.zk;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: lisy
 * @version: : ZKUtil , v0.1 2020年04月10日 6:37 下午
 * @remark: the ZKUtil is
 */
@Component
public class ZKUtil {

    private static final Logger logger = LoggerFactory.getLogger(ZKUtil.class);
    private static final int VERSION = -1;
    @Autowired
    private ZooKeeper zkClient;

    /**
     * 判断zk节点是否存在
     * @param path
     * @param needWatch 复用zookeeper中默认的watcher
     * @return
     */
    public Stat exists(String path , boolean needWatch){
        try {
            return zkClient.exists(path , needWatch);
        } catch (Exception e) {
            logger.info("exists zk path is error:{}" , e);
        }
        return null;
    }

    /**
     * 判断节点是否存在，并设置监听事件
     *  三种监听事件：create del update
     * @param path
     * @param watcher
     * @return
     */
    public Stat exists(String path , Watcher watcher){
        try {
            return zkClient.exists(path , watcher);
        } catch (Exception e) {
            logger.info("exists zk and watcher is error:{}" , e);
        }
        return null;
    }

    /**
     * 创建持久化节点
     * @param path
     * @param data
     * @return
     */
    public boolean createPerNode(String path , String data){
        try{
            zkClient.create(path , data.getBytes() , ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            return true;
        }catch (Exception e){
            logger.info("create persistent is error:{}" , e);
        }
        return false;
    }

    /**
     * 修改持久化节点
     * @param path
     * @param data
     * @return
     */
    public boolean updatePerNode(String path , String data){
        try{
            /**指定-1为忽略版本**/
            zkClient.setData(path , data.getBytes(), VERSION);
            return true;
        }catch (Exception e){
            logger.info("update zk node is error:{}" , e);
        }
        return false;
    }

    /**
     * 删除持久化节点
     * @param path
     * @return
     */
    public boolean delPerNode(String path){
        try{
            /**忽略版本**/
            zkClient.delete(path , VERSION);
            return true;
        }catch (Exception e){
            logger.info("delete zk node is error:{}", e);
        }
        return false;
    }

    /**
     * 获取当前节点的子节点(不包含孙子节点)
     * @param path
     * @return
     */
    public List<String> getChildrens(String path){
        try {
            return zkClient.getChildren(path ,false);
        } catch (Exception e) {
            logger.info("zk getChildrens is error:{}" , e);
        }
        return null;
    }

    /**
     * 获取当前节点的值
     * @param path
     * @param watcher
     * @return
     */
    public String getData(String path , Watcher watcher){
        Stat stat = new Stat();
        try{
            byte[] bytes = zkClient.getData(path, watcher, stat);
            return new String(bytes);
        }catch (Exception e){
            logger.info("zk getdata is error:{}" , e);
        }
        return null;
    }

    /**
     * 创建持久化节点
     * @param path
     * @param data
     * @return
     */
    public boolean createEphNode(String path , String data){
        try{
            zkClient.create(path , data.getBytes() , ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
            return true;
        }catch (Exception e){
            logger.info("create EPHEMERAL is error:{}" , e);
        }
        return false;
    }




}
