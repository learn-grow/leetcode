package com.dis.lock.zk;

import org.I0Itec.zkclient.exception.ZkMarshallingError;
import org.I0Itec.zkclient.serialize.ZkSerializer;

import java.io.UnsupportedEncodingException;

/**
 * @author: lisy
 * @version: : MyZkSer , v0.1 2020年06月07日 5:33 下午
 * @remark: the MyZkSer is
 */
public class MyZkSerializer implements ZkSerializer {

    String charset = "UTF-8";

    @Override
    public byte[] serialize(Object o) throws ZkMarshallingError {
        try {
            return String.valueOf(o).getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new ZkMarshallingError(e);
        }
    }

    @Override
    public Object deserialize(byte[] bytes) throws ZkMarshallingError {
        try {
            return new String(bytes, charset);
        } catch (UnsupportedEncodingException e) {
            throw new ZkMarshallingError(e);
        }
    }
}
