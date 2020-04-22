package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b2;

/**
 * @author: lisy
 * @version: : BSensitiveWordsFilter , v0.1 2020年04月20日 2:37 下午
 * @remark: the BSensitiveWordsFilter is B敏感词过滤系统提供的接口
 */
public class BSensitiveWordsAdaptor implements ISensitiveWordsFilter {

    private BSensitiveWordsFilter bSensitiveWordsFilter;

    public String filter(String text){
        text = bSensitiveWordsFilter.filter(text);
        return text;
    }
}
