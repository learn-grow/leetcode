package com.learn.desiagn.pattern.behavioralPattern.iterator;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author: lisy
 * @version: : Resource , v0.1 2020年05月18日 7:28 下午
 * @remark: the Resource is
 */
public class ResourceClose implements Closeable {

    public void read(){
        System.out.println("read line");
    }

    @Override
    public void close() throws IOException {
        System.out.println("close read ");
    }
}
