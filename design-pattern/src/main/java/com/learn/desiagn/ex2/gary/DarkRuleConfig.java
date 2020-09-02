package com.learn.desiagn.ex2.gary;

import java.util.List;

/**
 * @author: lisy
 * @version: : DarkRuleConfig , v0.1 2020年08月19日 4:42 下午
 * @remark: the DarkRuleConfig is
 */
public class DarkRuleConfig {

    private List<DarkFeatureConfig> features;

    public List<DarkFeatureConfig> getFeatures(){
        return this.features;
    }

    public void setFeatures(List<DarkFeatureConfig> features){
        this.features = features;
    }
}
