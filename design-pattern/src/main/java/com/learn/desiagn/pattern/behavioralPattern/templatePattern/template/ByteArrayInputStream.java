package com.learn.desiagn.pattern.behavioralPattern.templatePattern.template;

import java.io.IOException;

/**
 * @author: lisy
 * @version: : ByteArrayInputStream , v0.1 2020年04月30日 6:17 下午
 * @remark: the ByteArrayInputStream is
 */
public class ByteArrayInputStream extends InputStream {
    @Override
    protected int read() throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
