package com.netty.server.bio;

import java.io.IOException;
import java.net.Socket;

/**
 * @author: lisy
 * @version: : SocketClient , v0.1 2020年04月18日 12:42 下午
 * @remark: the SocketClient is
 */
public class SocketClient {

    public static void main(String args[]) throws IOException {
        Socket socket = new Socket("127.0.0.1",8001);
        /**
         * 向服务端发送消息
         */
        socket.getOutputStream().write("this is test".getBytes());
        socket.getOutputStream().flush();
        System.out.println("向服务端发送数据结束");
        byte[] bytes = new byte[1024];

        socket.getInputStream().read(bytes);
        System.out.println("接受服务端请求:" + new String(bytes));
        socket.close();
    }

}
