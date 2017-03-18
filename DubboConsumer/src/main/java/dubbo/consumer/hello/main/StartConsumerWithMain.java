package dubbo.consumer.hello.main;

import dubbo.common.hello.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by cheng.xi on 2017-03-10 14:28.
 */
public class StartConsumerWithMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        applicationContext.start();
        System.out.println("消费者端已经启动。");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        System.out.println("获取完bean");
        helloService.sayHello();

        System.out.println("按任意键退出");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
