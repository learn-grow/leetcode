package com.netty.server.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @author: lisy
 * @version: : NioClient , v0.1 2020年04月18日 2:26 下午
 * @remark: the NioClient is
 */
public class NioClient {

    public Selector selector;

    public static void main(String[] args) throws IOException {
        NioClient nioClient = new NioClient();
        nioClient.initClient("127.0.0.1",9000);
        nioClient.connect();
    }

    public void initClient(String ip , int port) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        this.selector = Selector.open();
        socketChannel.connect(new InetSocketAddress(ip , port));
        socketChannel.register(selector , SelectionKey.OP_CONNECT);
    }

    public void connect() throws IOException {
        while (true){
            selector.select();
            Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
            while (it.hasNext()){
                SelectionKey key = (SelectionKey) it.next();
                it.remove();
                if (key.isConnectable()){
                    SocketChannel channel = (SocketChannel) key.channel();
                    /**
                     * 如果连接正常,
                     */
                    if (channel.isConnectionPending()){
                        channel.finishConnect();
                    }
                    channel.configureBlocking(false);
                    ByteBuffer buffer = ByteBuffer.wrap("hello server".getBytes());
                    channel.write(buffer);
                    /**
                     * 在和服务端连接成功之后，为了可以接受到服务端的消息，需要给通道设置读的权限
                     */
                    channel.register(this.selector , SelectionKey.OP_READ);

                }else if (key.isReadable()){
                    read(key);
                }
            }
        }
    }

    private void read(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(512);
        int len = channel.read(buffer);
        if (len != -1){
            System.out.println("客户端收到服务端返回信息:" + new String(buffer.array() , 0 ,len));
        }
    }
}
