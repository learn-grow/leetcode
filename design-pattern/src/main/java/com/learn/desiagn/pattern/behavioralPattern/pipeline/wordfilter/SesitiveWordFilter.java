package com.learn.desiagn.pattern.behavioralPattern.pipeline.wordfilter;

/**
 * @author: lisy
 * @version: : SesitiveWordFilter , v0.1 2020年05月06日 1:50 下午
 * @remark: the SesitiveWordFilter is handler 抽象基类
 */
public interface SesitiveWordFilter {
    boolean doFilter(Context context);

}
