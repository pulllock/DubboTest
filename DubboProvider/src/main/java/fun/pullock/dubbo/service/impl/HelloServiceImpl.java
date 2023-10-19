package fun.pullock.dubbo.service.impl;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import fun.pullock.dubbo.service.HelloService;

/**
 * Created by cmcc on 15/4/12.
 */
public class HelloServiceImpl implements HelloService/*,ApplicationListener<ContextRefreshedEvent>*/ {
    @Override
    public void sayHello() {
        System.out.println("这里是Provider");
        System.out.println("HelloWorld Provider！");
        int defaultPort = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("dubbo").getDefaultPort();
        System.out.println("defalut port : " + defaultPort);
    }

    /*@Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(event);
        if(ContextRefreshedEvent.class.getName().equals(event.getClass().getName())){
            System.out.println("Bean初始化完成之后，开始调用事件通知。。。。");
        }
    }*/
}
