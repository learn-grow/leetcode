package com.dis.lock.hashConsistency;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lisy
 * @version: : HashConfiguration , v0.1 2020年04月14日 11:35 上午
 * @remark: the HashConfiguration is
 */
@Configuration
public class HashConfiguration {

    /**
     * 虚拟节点的数量
     **/
    @Value("${hash.nodes}")
    private int virtualNodes;
}
