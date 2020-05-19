package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.extractor.Compressor;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.extractor.Extractor;
import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.vistornew.impl.PdfFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : ToolApplaction , v0.1 2020年05月19日 2:48 下午
 * @remark: the ToolApplaction is
 */
public class ToolApplaction {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        Compressor compressor = new Compressor();
        List<ResourceFile> files = listAllResourceFiles(args[0]);
        for (ResourceFile file : files) {
            file.accept(extractor);
        }

        for (ResourceFile file : files) {
            file.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String arg) {
        List<ResourceFile> files = new ArrayList<>();
        files.add(new PdfFile("pdf"));
        files.add(new PdfFile("word"));
        files.add(new PdfFile("ppt"));
        return files;
    }
}
