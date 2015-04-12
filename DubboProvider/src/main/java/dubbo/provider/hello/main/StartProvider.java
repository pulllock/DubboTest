package dubbo.provider.hello.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by cheng.xi on 15/4/12.
 */
public class StartProvider {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.println("这里是dubbo-provider服务，按任意键退出");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
