package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor;

/**
 * @author: lisy
 * @version: : PPTFile , v0.1 2020年05月19日 1:23 下午
 * @remark: the PPTFile is
 */
public class PPTFile extends ResourceFile {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("读取ppt内容");
    }
}
