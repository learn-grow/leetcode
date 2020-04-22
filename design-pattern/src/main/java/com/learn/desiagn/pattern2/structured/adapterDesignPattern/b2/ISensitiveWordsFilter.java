package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b2;

/**
 * @author: lisy
 * @version: : ISensitiveWordsFilter , v0.1 2020年04月20日 2:39 下午
 * @remark: the ISensitiveWordsFilter is 统一的适配器改造
 */
public interface ISensitiveWordsFilter {

    String filter(String text);

}
