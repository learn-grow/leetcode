package com.learn.desiagn.pattern.behavioralPattern.pipeline.wordfilter;

/**
 * @author: lisy
 * @version: : AppliactionDemo , v0.1 2020年05月06日 1:59 下午
 * @remark: the AppliactionDemo is
 */
public class AppliactionDemo {

    public static void main(String[] args) {
        SensitiveWordFilterChain chain = new SensitiveWordFilterChain();
        chain.addFilter(new SexyWordFilter());

        boolean legal = chain.filter(new Context());
        if (!legal){
            System.out.println("敏感词违规");
        }else{
            System.out.println("正常发布");
        }
    }
}
