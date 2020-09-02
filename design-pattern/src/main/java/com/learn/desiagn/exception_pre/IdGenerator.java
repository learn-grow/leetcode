package com.learn.desiagn.exception_pre;

import java.net.UnknownHostException;

/**
 * @author: lisy
 * @version: : IdGenerator , v0.1 2020年08月27日 4:11 下午
 * @remark: the IdGenerator is
 */
public interface IdGenerator {

    public String generate() throws Exception;

    public String getLastFiledOfHostName() throws UnknownHostException;

}
