package com.raft.socket;

import com.raft.RaftConfig;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.json.JsonObjectDecoder;

/**
 * @author: lisy
 * @version: : RaftSocket , v0.1 2020年05月25日 3:46 下午
 * @remark: the RaftSocket is raft 通信与集群中其他的机器进行通信，包括主从心跳检测，选举
 */
public abstract class IRaftSocket {

    protected RaftConfig raftConfig;

    //主从心跳
    //验证是否有节点为主节点
    //发起投票
    //宣誓主节点
    //netty的通信

    public void startUp(){
        EventLoopGroup mainGroup = new NioEventLoopGroup(1);
        EventLoopGroup subGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(mainGroup , subGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG , 1024)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            ChannelPipeline pipeline = socketChannel.pipeline();
                            pipeline.addLast("decoder",new JsonObjectDecoder());
                            pipeline.addLast("encoder",new JsonObjectDecoder());
                            pipeline.addLast(new RaftServerHandler());
                        }
                    });
            ChannelFuture channelFuture = bootstrap.bind(9000).sync(); //异步等待bind执行完成
            //如果不使用sync ， 可以使用异步监听回调
            channelFuture.addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture channelFuture) throws Exception {
                    if (channelFuture.isSuccess()){
                        System.out.println("端口bind成功");
                    }else{
                        System.out.println("bind失败");
                    }
                }
            });
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            mainGroup.shutdownGracefully();
            subGroup.shutdownGracefully();
        }
    }

}
