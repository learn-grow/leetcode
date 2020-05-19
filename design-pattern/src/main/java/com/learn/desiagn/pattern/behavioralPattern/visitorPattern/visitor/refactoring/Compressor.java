package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.PPTFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.PdfFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.WordFile;

/**
 * @author: lisy
 * @version: : Compressor , v0.1 2020年05月19日 2:18 下午
 * @remark: the Compressor is
 */
public class Compressor {

    public void compressor(PPTFile pptFile){
        System.out.println("ppt compressor");
    }


    public void compressor(PdfFile pdfFile){
        System.out.println("pdf compressor");
    }


    public void compressor(WordFile wordFile){
        System.out.println("word compressor");
    }
}
