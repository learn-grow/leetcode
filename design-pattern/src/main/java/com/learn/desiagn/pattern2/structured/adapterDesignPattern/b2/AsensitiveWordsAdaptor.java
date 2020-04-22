package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b2;

/**
 * @author: lisy
 * @version: : AsensitiveWordsAdaptor , v0.1 2020年04月20日 2:41 下午
 * @remark: the AsensitiveWordsAdaptor is
 */
public class AsensitiveWordsAdaptor implements ISensitiveWordsFilter{

    private ASensitiveWordsFilter aSensitiveWordsFilter;


    @Override
    public String filter(String text) {
        String mText = aSensitiveWordsFilter.filterPoliticalWords(text);
        mText = aSensitiveWordsFilter.filterSexyWords(mText);
        return mText;
    }
}
