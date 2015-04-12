package dubbo.provider.hello.service.impl;

import dubbo.common.hello.service.HelloService;

/**
 * Created by cmcc on 15/4/12.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("这里是Provider");
        System.out.println("HelloWorld Provider！");
    }
}
