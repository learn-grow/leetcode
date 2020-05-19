package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : ToolApplaction , v0.1 2020年05月19日 1:25 下午
 * @remark: the ToolApplaction is
 */
public class ToolApplaction {

    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listResourceFiles(args[0]);
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.extract2txt();
        }
    }

    private static List<ResourceFile> listResourceFiles(String resourceDirectory) {
        List<ResourceFile> list = new ArrayList<>();
        list.add(new PPTFile("ppt.ppt"));
        list.add(new PdfFile("pdf.pdf"));
        list.add(new WordFile("word.wrod"));
        return list;
    }

}
