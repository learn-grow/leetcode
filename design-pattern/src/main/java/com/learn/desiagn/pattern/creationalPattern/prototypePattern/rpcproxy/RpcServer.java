package com.learn.desiagn.pattern.creationalPattern.prototypePattern.rpcproxy;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: lisy
 * @version: : RpcServer , v0.1 2020年04月13日 7:14 下午
 * @remark: the RpcServer is
 */
public class RpcServer {

    public void export(Object service , int port) throws IOException {
        if (service == null){
            throw new IllegalArgumentException("service instance is null");
        }

        if (port < 0 || port > 65535){
            throw new IllegalArgumentException("service prot is error:" + port);
        }

        ServerSocket serverSocket = new ServerSocket(port);
        while (true){
            final Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                        ObjectOutputStream outPut = new ObjectOutputStream(socket.getOutputStream());
                        String methodName = input.readUTF();
                        try {
                            Class<?>[] parameterTypes = (Class<?>[]) input.readObject();
                            Object[] arguments = (Object[]) input.readObject();
                            Method method = serverSocket.getClass().getMethod(methodName , parameterTypes);
                            Object result = method.invoke(serverSocket , arguments);
                            outPut.writeObject(result);

                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }finally {
                            outPut.close();
                            input.close();
                            socket.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
