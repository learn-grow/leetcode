package com.raft.enums;

/**
 * @author: lisy
 * @version: : RaftRole , v0.1 2020年05月25日 3:57 下午
 * @remark: the RaftRole is
 */
public enum RaftStatus {

    /**
     * 主节点
     */
    LEADER,

    /**
     * 跟随者
     */
    FOLLOWER,

    /**
     * 候选者
     */
    CANDIDATE;
}
