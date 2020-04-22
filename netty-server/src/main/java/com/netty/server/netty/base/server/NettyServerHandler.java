package com.netty.server.netty.base.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static io.netty.util.CharsetUtil.*;

/**
 * @author: lisy
 * @version: : NettyServerHandler , v0.1 2020年04月19日 2:07 下午
 * @remark: the NettyServerHandler is
 */
public class NettyServerHandler extends ChannelInboundHandlerAdapter {

    /**
     * 读取客户端 数据
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("服务端读取线程：" + Thread.currentThread().getName());
        ByteBuf buffer = (ByteBuf) msg;
        System.out.println("接收到客户端消息:" + buffer.toString(CharsetUtil.UTF_8));
    }


    /**
     * 接受数据，处理客户端
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ByteBuf buffer = Unpooled.copiedBuffer("this is server to client msg".getBytes());
        ctx.writeAndFlush(buffer);
    }

    /**
     * 异常连接关闭
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
