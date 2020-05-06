package com.learn.desiagn.pattern.behavioralPattern.pipeline.wordfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : SensitiveWordFilterChain , v0.1 2020年05月06日 1:57 下午
 * @remark: the SensitiveWordFilterChain is
 */
public class SensitiveWordFilterChain {

    private List<SesitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SesitiveWordFilter wordFilter){
        filters.add(wordFilter);
    }

    public boolean filter(Context context){
        boolean flag = false;
        for (SesitiveWordFilter filter : filters) {
            flag = filter.doFilter(context);
        }
        return flag;
    }
}
