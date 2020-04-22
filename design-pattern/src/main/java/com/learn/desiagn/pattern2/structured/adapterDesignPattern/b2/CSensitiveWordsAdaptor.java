package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b2;

/**
 * @author: lisy
 * @version: : CSensitiveWordsFilter , v0.1 2020年04月20日 2:38 下午
 * @remark: the CSensitiveWordsFilter is C敏感词过滤系统提供的接口
 */
public class CSensitiveWordsAdaptor implements ISensitiveWordsFilter {

    private CSensitiveWordsFilter cSensitiveWordsFilter;

    public String filter(String text){
        text = cSensitiveWordsFilter.filter(text);
        return text;
    }
}
