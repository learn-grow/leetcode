package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl;

import com.learn.desiagn.pattern.behavioralPattern.iterator.Resource;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.Compressor;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.Extractor;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.ResourceFile;

/**
 * @author: lisy
 * @version: : PPTFile , v0.1 2020年05月19日 1:34 下午
 * @remark: the PPTFile is
 */
public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extractor2txt(this);
    }

    @Override
    public void accept(Compressor compressor) {
        compressor.compressor(this);
    }
}
