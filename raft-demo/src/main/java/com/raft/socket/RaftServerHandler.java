package com.raft.socket;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.json.JsonObjectDecoder;
import io.netty.util.CharsetUtil;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: lisy
 * @version: : RaftServerHandler , v0.1 2020年05月25日 4:07 下午
 * @remark: the RaftServerHandler is
 */
public class RaftServerHandler extends SimpleChannelInboundHandler<JsonObjectDecoder> {

    private static ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

    /**
     * 节点启动后首先给集群中其他节点发送消息
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channels.writeAndFlush("客户端:" + channel.remoteAddress() + " 上线了" + sdf.format(new Date()));
        channels.add(channel);
    }

    /**
     * 当集群节点下线时通知其他节点
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channels.writeAndFlush("客户端:" + channel.remoteAddress() + " 已离线");
    }

    /**
     * 其他节点接收到消息之后处理
     * @param channel
     * @param msg
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext channel, JsonObjectDecoder msg) throws Exception {
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
