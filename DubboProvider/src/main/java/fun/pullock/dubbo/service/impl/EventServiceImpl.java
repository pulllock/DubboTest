/*package dubbo.provider.hello.service.impl;

import service.dubbo.fun.pullock.EventService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class EventServiceImpl implements EventService,ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void testEvent() {
        System.out.println("testEvent");
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(event);
        if(ContextRefreshedEvent.class.getName().equals(event.getClass().getName())){
            System.out.println(" eventService Bean初始化完成之后，开始调用事件通知。。。。");
        }
    }
}*/
