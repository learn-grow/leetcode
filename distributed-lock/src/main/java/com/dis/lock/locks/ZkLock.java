package com.dis.lock.locks;

import com.dis.lock.zk.ZKUtil;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: lisy
 * @version: : ZkLock , v0.1 2020年04月12日 3:11 下午
 * @remark: the ZkLock is
 */
@Component
public class ZkLock implements IDisLock {

    private static String ROOT_PATH = "/locks";
    private static String SPILT = "/";
    private final static Integer MAX_COUNT = 10;




    @Autowired
    ZKUtil zkUtil;

    /**
     * 锁名
     */
    public String name;

    /**
     * 锁在zk上的完整路径
     */
    public String fullPath;

    /**
     * 锁路径
     */
    public String basePath;

    public ZkLock(String name) {
        this.name = name;
        init();
    }

    /**
     * @方法名称 init
     * @功能描述 <pre>初始化</pre>
     */
    public void init() {
        this.basePath = ROOT_PATH.concat(SPILT).concat(name);
        try {
            if (null == zkUtil.exists(ROOT_PATH, false)) {
                zkUtil.createEphNode(ROOT_PATH, "");
            }
        } catch (Exception e) {
            logger.warn("zk lock init error{}", e);
        }
    }

    @Override
    public boolean lock(int ttl) throws RuntimeException {
        List<String> children = getSortLockNode();
        if (null == children) {
            return false;
        }
        /**当前有序节点名(锁名)**/
        String sequenceNodeName = fullPath.substring(basePath.length() + 1);
        /**如果客户端创建的顺序节点在locker的所有子节点中排序位置为0，则表示获取到了锁**/
        int ourIndex = children.indexOf(sequenceNodeName);
        /*没有找到临时节点，证明锁获取失败**/
        if (ourIndex < 0) {
            return false;
        }
        /**
         * 检验是否未最小节点，是则获取锁
         */
        if (ourIndex == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void _startHeartThread() {

    }

    @Override
    public void close() {
        if (null == fullPath) {
            return;
        }
        zkUtil.delPerNode(fullPath);
    }


    /**
     * 获取锁下所有的节点，并排序-升序
     * @return
     */
    private List<String> getSortLockNode() {
        String path = basePath.concat(SPILT).concat(name);
        if (null == zkUtil.exists(basePath, false)) {
            zkUtil.createPerNode(basePath, "");
        }
        /**
         * 2、创建 当前锁名 的临时节点(在[basePath持久节点]下创建客户端要获取锁的[临时]顺序节点)
         */
        boolean isDone = false;
        int retryCount = 0;
        while (!isDone) {
            isDone = true;
            try {
                fullPath = zkUtil.createEphNode(path, "");
                List<String> children =  zkUtil.getChildrens(basePath);
                Collections.sort(children, new Comparator<String>() {
                    @Override
                    public int compare(String lhs, String rhs) {
                        return getLockNodeNumber(lhs, name).compareTo(getLockNodeNumber(rhs, name));
                    }
                });
                return children;
            } catch (Exception e) {
                if (retryCount++ < MAX_COUNT) {
                    isDone = false;
                }
            }
        }
        return null == fullPath ? null : new ArrayList<String>();
    }

    /**
     * 获取节点版本标识
     * @param str 节点完整名(含版本标识)
     * @param lockName 节点名
     * @return 节点版本标识
     */
    public static String getLockNodeNumber(String str, String lockName) {
        int index = str.lastIndexOf(lockName);
        if (index >= 0) {
            index += lockName.length();
            return index <= str.length() ? str.substring(index) : "";
        }
        return str;
    }
}
