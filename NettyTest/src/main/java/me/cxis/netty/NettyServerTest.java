package me.cxis.netty;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * Created by cheng.xi on 2017-03-09 23:14.
 */
public class NettyServerTest {

    private final int port;

    public NettyServerTest(int port){
        this.port = port;
    }

    public void startServer(){
        ChannelFactory channelFactory = new NioServerSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool());
        ServerBootstrap serverBootstrap = new ServerBootstrap(channelFactory);

        serverBootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            @Override
            public ChannelPipeline getPipeline() throws Exception {
                return Channels.pipeline(new ServerHandlerTest());
            }
        });

        serverBootstrap.bind(new InetSocketAddress(port));
    }

    public static void main(String[] args) {
        new NettyServerTest(8888).startServer();
    }
}
