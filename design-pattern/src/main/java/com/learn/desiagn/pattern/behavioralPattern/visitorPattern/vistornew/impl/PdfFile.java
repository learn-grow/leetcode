package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.ResourceFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.Vistor;

/**
 * @author: lisy
 * @version: : PdfFile , v0.1 2020年05月19日 2:41 下午
 * @remark: the PdfFile is
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
