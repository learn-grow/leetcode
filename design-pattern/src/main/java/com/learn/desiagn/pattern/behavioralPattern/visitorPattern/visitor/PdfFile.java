package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor;

/**
 * @author: lisy
 * @version: : PdfFile , v0.1 2020年05月19日 1:24 下午
 * @remark: the PdfFile is
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("read pdf data .");
    }
}
