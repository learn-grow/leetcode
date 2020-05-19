package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring;


import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.PPTFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.PdfFile;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor.refactoring.impl.WordFile;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : ToolApplaction , v0.1 2020年05月19日 1:35 下午
 * @remark: the ToolApplaction is
 */
public class ToolApplaction {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourcesFiles(args[0]);
        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
            resourceFile.accept(compressor);
        }




    }

    private static List<ResourceFile> listAllResourcesFiles(String resourceDirect) {
        List<ResourceFile> files = new ArrayList<>();
        files.add(new PdfFile("PDF"));
        files.add(new WordFile("WORD"));
        files.add(new PPTFile("PPT"));
        return files;
    }
}
