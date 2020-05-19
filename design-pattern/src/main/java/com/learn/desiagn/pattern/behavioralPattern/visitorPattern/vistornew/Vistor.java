package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl.PdfFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl.PptFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl.WordFile;

/**
 * @author: lisy
 * @version: : Vistor , v0.1 2020年05月19日 2:40 下午
 * @remark: the Vistor is
 */
public interface Vistor {

    void visit(PdfFile pdfFile);

    void visit(PptFile pdfFile);

    void visit(WordFile pdfFile);
}
