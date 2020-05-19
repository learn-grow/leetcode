package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.extractor;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.Vistor;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl.PdfFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl.PptFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl.WordFile;

/**
 * @author: lisy
 * @version: : Extractor , v0.1 2020年05月19日 2:45 下午
 * @remark: the Extractor is
 */
public class Extractor implements Vistor {

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("read paf file.");
    }

    @Override
    public void visit(PptFile pptFile) {
        System.out.println("read ppt file.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("read word file.");
    }
}
