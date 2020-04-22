package com.netty.server.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: lisy
 * @version: : SocketServer , v0.1 2020年04月18日 12:46 下午
 * @remark: the SocketServer is
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8001);
        while (true){
            System.out.println("等待连接！");
            Socket socket = serverSocket.accept();
            System.out.println("有客户连接:");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        handler(socket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public static void handler(Socket socket) throws IOException {
        System.out.println("thread is :" + Thread.currentThread().getId());
        byte[] bytes = new byte[1024];
        socket.getInputStream().read(bytes);
        System.out.println("接受到消息:" + new String(bytes));
        socket.getOutputStream().write(("我已经接受到消息了 :" + new String(bytes)).getBytes());
        socket.getOutputStream().flush();
        socket.close();
    }
}
