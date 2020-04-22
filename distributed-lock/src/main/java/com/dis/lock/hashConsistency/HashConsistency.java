package com.dis.lock.hashConsistency;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author: lisy
 * @version: : HashConsistency , v0.1 2020年04月14日 10:38 上午
 * @remark: the HashConsistency is 一致性hash算法，在每个Redis上注册一个心跳监测，如果无法监测到心跳，就去做故障的处理
 */
public class HashConsistency {

    private static String[] nodesMap =
            new String[]{"192.168.1.1", "192.168.1.2", "192.168.2.1", "192.168.2.2", "192.168.3.1", "192.168.3.2"};
    /**
     * 真实节点与虚拟节点的映射关系
     **/
    private static SortedMap<Integer, String> nodesRreplicas = new TreeMap<Integer, String>();
    /**
     * 真实节点
     **/
    private static List<String> nodes = new LinkedList<>();

    /**
     * 虚拟节点的数量
     **/
    private final static int virtualNodes = 2;

    private final static String CONN = "&&VM";

    static {
        for (String s : nodesMap) {
            nodes.add(s);
            for (int i = 0; i < virtualNodes; i++) {
                String virtualName = s + CONN + i;
                int hash = getHash(virtualName);
                nodesRreplicas.put(hash, virtualName);
            }
        }
    }

    /**
     * 使用FNV1_32_HASH算法计算服务器的Hash值
     *
     * @param str
     * @return
     */
    private static int getHash(String str) {
        final int p = 16777619;
        int hash = (int) 2166136261L;
        for (int i = 0; i < str.length(); i++)
            hash = (hash ^ str.charAt(i)) * p;
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;
        /**
         * 如果算出来的值为负数则取其绝对值
         */
        if (hash < 0)
            hash = Math.abs(hash);
        return hash;
    }


    private static String getServer(String key) {
        int hash = getHash(key);
        /**
         * 获取大于hash值的
         */
        SortedMap<Integer, String> map = nodesRreplicas.tailMap(hash);
        String virtualNode;
        if (map.isEmpty()) {
            int i = nodesRreplicas.firstKey();
            virtualNode = nodesRreplicas.get(i);
        } else {
            int i = map.firstKey();
            virtualNode = map.get(i);
        }

        if (isNotBlank(virtualNode)) {
            return virtualNode.substring(0, virtualNode.indexOf(CONN));
        }
        return null;
    }

    /**
     * 删除节点 todo 要去删除对应的虚拟节点
     */
    public static void deleteNode(){

    }

    public static void addNode(){
        // todo 增加节点，增加对应的虚拟节点
    }


    public static boolean isNotBlank(String virtualMap) {
        if (virtualMap.contains(CONN)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] keys = {"cache_1", "cache_2", "cache_3"};
        for (int i = 0; i < keys.length; i++)
            System.out.println("[" + keys[i] + "]的hash值为" +
                    getHash(keys[i]) + ", 被路由到结点[" + getServer(keys[i]) + "]");

    }
}
