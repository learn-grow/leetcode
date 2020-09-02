package com.learn.desiagn.ex2.gary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: lisy
 * @version: : DarkLaunch , v0.1 2020年08月19日 4:36 下午
 * @remark: the DarkLaunch is
 */
public class DarkLaunch {

    private static final Logger log = LoggerFactory.getLogger(DarkLaunch.class);

    private static final int DEFAULT_RULE_UPDATE_INTERVAL = 60;

    private DarkRule darkRule;

    private ScheduledExecutorService executorService;

    public DarkLaunch(int ruleUpdateTimeInterval) {
        loadRule();
        this.executorService = Executors.newSingleThreadScheduledExecutor();
        this.executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                loadRule();
            }
        }, ruleUpdateTimeInterval, ruleUpdateTimeInterval, TimeUnit.SECONDS);
    }

    public DarkLaunch() {
        this(DEFAULT_RULE_UPDATE_INTERVAL);
    }

    private void loadRule() {
        InputStream in = null;
        DarkRuleConfig ruleConfig = null;

        try {
            in = this.getClass().getResourceAsStream("/dark-rule.yml");
            if (null != in) {
                Yaml yaml = new Yaml();
                ruleConfig = yaml.loadAs(in, DarkRuleConfig.class);
            }
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    log.error("close the dark-rule.yml error", e);
                }
            }
        }

        if (null == ruleConfig){
            throw new RuntimeException("cat not load config");
        }

        DarkRule newRule = new DarkRule(ruleConfig);
        this.darkRule = newRule;
    }
}
