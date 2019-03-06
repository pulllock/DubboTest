package me.cxis.dubbo.generic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dubbo-consumer.xml")
public class GenericTest {

    @Resource
    private GenericDubbo genericDubbo;

    @Test
    public void test() {
        String interfaceClass = "me.cxis.dubbo.service.UserService";
        String methodName = "query";
        String[] paramTypes = new String[] {"me.cxis.dubbo.query.UserQuery"};
        // me.cxis.dubbo.query.UserQuery query = new me.cxis.dubbo.query.UserQuery();
        UserQuery query = new UserQuery();
        Object[] params = new Object[]{query};
        Object result = genericDubbo.invokeDubbo(interfaceClass, methodName, paramTypes, params);
        System.out.println(result);
    }
}
