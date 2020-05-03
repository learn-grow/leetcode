package com.learn.desiagn.pattern.behavioralPattern.templatePattern.template;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author: lisy
 * @version: : InputStram , v0.1 2020年04月30日 6:15 下午
 * @remark: the InputStram is
 */
public abstract class InputStream implements Closeable {

    public int read(byte b[], int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return 0;
        }

        int c = read();
        if (c == -1) {
            return -1;
        }
        b[off] = (byte)c;

        int i = 1;
        try {
            for (; i < len ; i++) {
                c = read();
                if (c == -1) {
                    break;
                }
                b[off + i] = (byte)c;
            }
        } catch (IOException ee) {
        }
        return i;
    }

    protected  abstract int read() throws IOException;

}
