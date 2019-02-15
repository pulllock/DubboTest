package me.cxis.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import me.cxis.dubbo.service.HelloService;
import me.cxis.dubbo.service.impl.HelloServiceImpl;

/**
 * Created by cheng.xi on 2017-03-06 09:11.
 */
public class StartProviderUseApi {
    public static void main(String[] args) {
        //当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("dubbo-provider");

        //注册中心
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("127.0.0.1:2181");

        //服务提供者协议配置
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(20880);

        //服务的实现
        HelloService helloService = new HelloServiceImpl();

        //服务提供者暴露服务配置
        ServiceConfig<HelloService> service = new ServiceConfig<>();
        service.setApplication(application);
        service.setRegistry(registry);
        service.setProtocol(protocol);
        service.setInterface(HelloService.class);
        service.setRef(helloService);
        service.setVersion("1.0.0");
        //暴露服务
        service.export();
    }

}
