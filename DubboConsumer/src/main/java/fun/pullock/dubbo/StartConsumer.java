package fun.pullock.dubbo;

import fun.pullock.dubbo.service.HelloService;
import fun.pullock.dubbo.model.UserDTO;
import fun.pullock.dubbo.result.CallResult;
import fun.pullock.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        applicationContext.start();

        System.out.println("消费者端已经启动。");

        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        System.out.println("获取完bean");
        helloService.sayHello();

        UserService userService = (UserService) applicationContext.getBean("userService");
        CallResult<UserDTO> callResult = userService.getUserById(1);
        System.out.println(callResult);

        System.out.println("按任意键退出");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
