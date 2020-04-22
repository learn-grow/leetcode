package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b2;

/**
 * @author: lisy
 * @version: : ASensitiveWordsFilter , v0.1 2020年04月20日 2:33 下午
 * @remark: the ASensitiveWordsFilter is A敏感词过滤系统提供的接口
 */
public class ASensitiveWordsFilter {

    public String filterSexyWords(String text){
        if (text.endsWith("a")){
            throw new RuntimeException("敏感词");
        }
        return text;
    }

    public String filterPoliticalWords(String text){
        if (text.endsWith("b")){
            throw new RuntimeException("敏感词");
        }
        return text;
    }
}
