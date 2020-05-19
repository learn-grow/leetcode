package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring;

/**
 * @author: lisy
 * @version: : ResourceFile , v0.1 2020年05月19日 1:32 下午
 * @remark: the ResourceFile is
 */
public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath){
        this.filePath = filePath;
    }

    abstract public void accept(Extractor extractor);
    abstract public void accept(Compressor compressor);
}
