package com.netty.server.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @author: lisy
 * @version: : NioSocketServer , v0.1 2020年04月18日 1:11 下午
 * @remark: the NioSocketServer is
 */
public class NioSocketServer {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel channel = ServerSocketChannel.open(); //创建一个本地socket 连接通道

        channel.configureBlocking(false); //设置阻塞方式为非阻塞
        channel.bind(new InetSocketAddress(9000));
        //创建一个selector
        Selector selector = Selector.open();

        channel.register(selector , SelectionKey.OP_ACCEPT); //将serverSocketChannel注册到selector 多路复用器上，并且指定为监听什么类型的事件

        while (true){
            System.out.println("等待连接事件的到来!~");
            /**
             * 轮询监听 selector
             */
            selector.select();
            System.out.println("有事件到来!");
            Iterator<SelectionKey> it = selector.selectedKeys().iterator();
            while (it.hasNext()){
                SelectionKey key = it.next();
                //删除本次处理的key,防止下次selector重复处理
                it.remove();
                handler(key);
            }
        }
    }

    public static void handler(SelectionKey key) throws IOException {
        if (key.isAcceptable()){
            System.out.println("有客户端发送了连接请求");
            ServerSocketChannel channel = (ServerSocketChannel) key.channel();
            /**
             * NIO 非阻塞表现 :此处accept 是阻塞的，但是这里因为是发生了连接事件，所以这个方法
             * 会马上执行，不会阻塞，
             * 就是因为selector的多路复用机制，去监听的事件去做相应的处理，所以只有发生了accept连接事件的时候，
             * 才会走到这里，立即去accept事件去做处理（立即处理，而不是等待事件到来），
             */
            SocketChannel socketChannel = channel.accept();
            socketChannel.configureBlocking(false);
            socketChannel.register(key.selector() ,SelectionKey.OP_READ);
        }else if(key.isReadable()){
            System.out.println("有连接可读事件");
            SocketChannel socketChannel = (SocketChannel) key.channel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            /**
             * NIO 非阻塞表现：read 方法不会阻塞，其次这种事件响应模型，当调用到read方法时肯定是发生了客户端 发送数据的 事件操作
             * 所以在理解NIO的时候，要明确NIO的操作 selector(io 多路复用) 是一个事件响应，去不断轮询监听所有的事件，
             * 当发生了什么样的事件就去做响应的处理
             *
             */
            int len =  socketChannel.read(byteBuffer);
            if (len != -1){
                System.out.println("读到去到客户端数据:" + new String(byteBuffer.array(), 0, len));
            }
            ByteBuffer writeBuffer = ByteBuffer.wrap("hello client".getBytes());
            socketChannel.write(writeBuffer);
            /**
             * NIo 事件触发是水平处理
             * 使用java NIO 编程的时候，如果没有数据往外写的时候，要取消写事件
             * 在有数据往外写的时候再去注册对应的事件
             */
            key.interestOps(SelectionKey.OP_READ | SelectionKey.OP_WRITE);
            //socketChannel.close();
        }else if (key.isWritable()){
            SocketChannel socketChannel = (SocketChannel) key.channel();
            System.out.println("写事件");
            key.interestOps(SelectionKey.OP_READ);
            socketChannel.close();
        }
    }
}
