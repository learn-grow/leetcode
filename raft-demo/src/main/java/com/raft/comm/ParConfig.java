package com.raft.comm;

import com.raft.enums.ParConfigEnum;
import me.grison.jtoml.impl.Toml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author: lisy
 * @version: : ParConfig , v0.1 2020年05月25日 5:04 下午
 * @remark: the ParConfig is
 */
public class ParConfig {

    private final static String SPILIT = ",";

    private static ServerConfig serverConfig = new ServerConfig();

    /**
     * 解析配置文件
     *
     * @param file
     * @return
     */
    public static ServerConfig getConfig(File file) {
        try {
            Toml toml = Toml.parse(file);
            Map<String, Object> map = toml.getMap(ParConfigEnum.SERVER.code());
            serverConfig.setPort(Integer.valueOf(map.get(ParConfigEnum.PORT.code()).toString()));
            serverConfig.setTickTime(Integer.valueOf(map.get(ParConfigEnum.TICKTIME.code()).toString()));

            Map<String, Object> cluster = toml.getMap(ParConfigEnum.CLUSTER.code());
            String[] clusters = cluster.get(ParConfigEnum.CLUSTERS.code()).toString().split(SPILIT);
            List<String> arrays = new ArrayList<>();
            for (String s : clusters) {
                arrays.add(s);
            }
            serverConfig.setCluster(arrays);

        } catch (IOException e) {

            e.printStackTrace();
        }
        return serverConfig;
    }
}
