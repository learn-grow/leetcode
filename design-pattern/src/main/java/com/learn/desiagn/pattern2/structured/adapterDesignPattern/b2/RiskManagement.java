package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : RiskManagement , v0.1 2020年04月20日 2:45 下午
 * @remark: the RiskManagement is
 */
public class RiskManagement {

    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(ISensitiveWordsFilter sensitiveWordsFilter){
        filters.add(sensitiveWordsFilter);
    }

    public String filterSensitiveWords(String text){
        for (ISensitiveWordsFilter sensitiveWordsFilter : filters){
            text = sensitiveWordsFilter.filter(text);
        }
        return text;
    }
}
