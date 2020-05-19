package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.PPTFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.PdfFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.WordFile;

/**
 * @author: lisy
 * @version: : Extractor , v0.1 2020年05月19日 1:34 下午
 * @remark: the Extractor is
 */
public class Extractor {

    public void extractor2txt(PPTFile pptFile){
        System.out.println("ppt read");
    }


    public void extractor2txt(PdfFile pdfFile){
        System.out.println("pdf read");
    }


    public void extractor2txt(WordFile wordFile){
        System.out.println("word read");
    }
}
