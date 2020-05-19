package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.ResourceFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.Vistor;

/**
 * @author: lisy
 * @version: : PptFile , v0.1 2020年05月19日 2:42 下午
 * @remark: the PptFile is
 */
public class PptFile extends ResourceFile {
    public PptFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
