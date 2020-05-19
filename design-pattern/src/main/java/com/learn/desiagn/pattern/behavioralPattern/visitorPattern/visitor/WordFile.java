package com.learn.desiagn.pattern.behavioralPattern.visitorPattern.visitor;

/**
 * @author: lisy
 * @version: : WordFile , v0.1 2020年05月19日 1:24 下午
 * @remark: the WordFile is
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("read word data.");
    }
}
