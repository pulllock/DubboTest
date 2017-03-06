package dubbo.provider.hello.service.impl;

import dubbo.common.hello.service.HelloService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by cmcc on 15/4/12.
 */
public class HelloServiceImpl implements HelloService,ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void sayHello() {
        System.out.println("这里是Provider");
        System.out.println("HelloWorld Provider！");
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(event);
        if(ContextRefreshedEvent.class.getName().equals(event.getClass().getName())){
            System.out.println("Bean初始化完成之后，开始调用事件通知。。。。");
        }
    }
}
