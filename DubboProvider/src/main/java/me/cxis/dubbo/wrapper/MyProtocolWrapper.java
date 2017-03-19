package me.cxis.dubbo.wrapper;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * Created by cheng.xi on 2017-03-18 19:01.
 */
public class MyProtocolWrapper implements Protocol {

    private Protocol protocol;

    public MyProtocolWrapper(Protocol protocol){
        this.protocol = protocol;
    }

    @Override
    public int getDefaultPort() {
        System.out.println("MyProtocolWrapper.getDefaultProt");
        return protocol.getDefaultPort();
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        System.out.println("MyProtocolWrapper.export");
        return protocol.export(invoker);
    }

    @Override
    public <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException {
        System.out.println("MyProtocolWrapper.refer");
        return protocol.refer(type,url);
    }

    @Override
    public void destroy() {
        System.out.println("MyProtocolWrapper.destroy");
    }
}
