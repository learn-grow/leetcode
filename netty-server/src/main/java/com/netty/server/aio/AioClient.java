package com.netty.server.aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;

/**
 * @author: lisy
 * @version: : AioClient , v0.1 2020年04月19日 1:19 下午
 * @remark: the AioClient is
 */
public class AioClient {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        AsynchronousSocketChannel channel = AsynchronousSocketChannel.open();
        channel.connect(new InetSocketAddress("127.0.0.1",9000)).get();
        channel.write(ByteBuffer.wrap("hello server".getBytes()));
        ByteBuffer buffer = ByteBuffer.allocate(512);
        Integer len = channel.read(buffer).get();
        if (len != -1){
            System.out.println("client info：" + new String(buffer.array() , 0 , len));
        }

    }
}
