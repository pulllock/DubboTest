package fun.pullock.dubbo.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;

public class DubboProtocolAdaptiveSpiTest {

    public static void main(String[] args) {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();

        System.out.println(protocol);
    }
}
