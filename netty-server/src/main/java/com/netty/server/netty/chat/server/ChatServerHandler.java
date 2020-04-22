package com.netty.server.netty.chat.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: lisy
 * @version: : ChatServerHandler , v0.1 2020年04月19日 9:04 下午
 * @remark: the ChatServerHandler is
 */
public class ChatServerHandler extends SimpleChannelInboundHandler<String> {

    private static ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channels.writeAndFlush("客户端:" + channel.remoteAddress() + " 上线了" + sdf.format(new Date()));
        channels.add(channel);
        System.out.println(ctx.channel().remoteAddress() + " 上线了");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channels.writeAndFlush("客户端:" + channel.remoteAddress() + " 已离线");
        System.out.println(ctx.channel().remoteAddress() + " 下线了");
        System.out.println("channels :" + channels.size());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channel, String msg) throws Exception {
        Channel channel1 = channel.channel();
        channels.forEach(ch -> {
            if (channel1 != ch){
                ch.writeAndFlush("客户端:" + ch.remoteAddress() + "给你发送了消息:" + msg);
            }else{
                ch.writeAndFlush("自己发送了消息:" + msg);
            }
        });
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
