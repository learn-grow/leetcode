package com.learn.desiagn.pattern.behavioralPattern.strategyPattern.my;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author: lisy
 * @version: : UseCache , v0.1 2020年05月06日 10:28 上午
 * @remark: the UseCache is
 */
public class UseCache {


    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("./resources/config.properties"));
        String type = (String) properties.getProperty("eviction_type");
        Strategy strategy = StrategyFactoryNoState.getStrategy(type);
        strategy.algorithmInterface();
    }
}
