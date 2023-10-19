package fun.pullock.netty;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

import java.util.concurrent.Executors;

public class NettyClientTest {
    private final String host;
    private final int port;
    private final String msg;

    public NettyClientTest(String host,int port,String msg){
        this.host = host;
        this.port = port;
        this.msg = msg;
    }

    public void startClient(){
        ChannelFactory channelFactory = new NioClientSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool());
        ClientBootstrap clientBootstrap = new ClientBootstrap(channelFactory);

        clientBootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            @Override
            public ChannelPipeline getPipeline() throws Exception {
                return Channels.pipeline();
            }
        });
    }

}
