package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.ResourceFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.Vistor;

/**
 * @author: lisy
 * @version: : WordFile , v0.1 2020年05月19日 2:44 下午
 * @remark: the WordFile is
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
