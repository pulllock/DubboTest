package me.cxis.dubbo.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;

/**
 * @author chengxi
 */
public class DubboProtocolSpiTest {

    public static void main(String[] args) {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);

        Protocol dubboProtocol = extensionLoader.getExtension("dubbo");
        System.out.println(dubboProtocol.getDefaultPort());
    }
}
