package me.cxis.netty;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;

import java.nio.charset.Charset;

/**
 * Created by cheng.xi on 2017-03-09 23:20.
 */
public class ServerHandlerTest extends SimpleChannelUpstreamHandler {
    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        ChannelBuffer channelBuffer = (ChannelBuffer)e.getMessage();
        String msg = channelBuffer.toString(Charset.defaultCharset());
        if(msg != null && !"".equals(msg)){
            System.out.println("服务端接收到消息：" + msg);
            ChannelBuffer sendMsg = ChannelBuffers.dynamicBuffer();
            sendMsg.writeBytes("我是服务器，已经接到消息".getBytes());
            e.getChannel().write(sendMsg);
        }else {
            e.getChannel().write("我是服务器，收到了空消息");
        }
        e.getChannel().close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
        e.getCause();
        e.getChannel().close();
    }
}
