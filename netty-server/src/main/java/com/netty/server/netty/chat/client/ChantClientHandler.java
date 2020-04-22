package com.netty.server.netty.chat.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author: lisy
 * @version: : ChantClientHandler , v0.1 2020年04月19日 9:53 下午
 * @remark: the ChantClientHandler is
 */
public class ChantClientHandler extends SimpleChannelInboundHandler<String> {


    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String msg) throws Exception {
        System.out.println(msg.trim());
    }
}
