package fun.pullock.dubbo;

import fun.pullock.dubbo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dubbo-consumer.xml")
public class StartConsumerTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void test(){
        System.out.println("dubbo-consumer服务启动，调用！");
        helloService.sayHello();

    }
}
