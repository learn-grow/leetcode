package com.raft;

import com.raft.comm.ParConfig;
import com.raft.comm.ServerConfig;
import com.raft.enums.ParConfigEnum;
import me.grison.jtoml.impl.Toml;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author: lisy
 * @version: : RaftStrap , v0.1 2020年05月25日 4:34 下午
 * @remark: the RaftStrap is
 */
public class RaftStrap {

    public static void main(String[] args) {
        main0();
    }

    private static void main0() {
        ServerConfig serverConfig = ParConfig.getConfig(new File("/Users/lishaoyong/code-cn/my/leetcode/raft-demo/src/main/resources/META-INFO/raft.toml"));
        System.out.println(serverConfig.toString());

    }
}
