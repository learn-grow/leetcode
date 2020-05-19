package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor;

/**
 * @author: lisy
 * @version: : Resource , v0.1 2020年05月19日 1:21 下午
 * @remark: the Resource is
 */
public abstract class ResourceFile {

    protected String filePath; //文件路径

    public ResourceFile(String filePath){
        this.filePath = filePath;
    }

    public abstract void extract2txt();
}
