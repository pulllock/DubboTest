package dubbo.consumer.hello.main;

import dubbo.common.hello.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by cheng.xi on 15/4/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dubbo-consumer.xml")
public class StartConsumer {

    @Autowired
    private HelloService helloService;

    @Test
    public void test(){
        System.out.println("dubbo-consumer服务启动，调用！");
        helloService.sayHello();

    }
}
