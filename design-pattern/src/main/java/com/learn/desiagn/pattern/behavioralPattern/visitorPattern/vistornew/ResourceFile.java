package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew;

/**
 * @author: lisy
 * @version: : ResourceFile , v0.1 2020年05月19日 2:37 下午
 * @remark: the ResourceFile is
 */
public abstract class ResourceFile {
    private String filePath;
    public ResourceFile(String filePath){
        this.filePath = filePath;
    }

    abstract public void accept(Vistor vistor);
}
