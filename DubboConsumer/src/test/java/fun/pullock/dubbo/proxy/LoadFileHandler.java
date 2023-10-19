package fun.pullock.dubbo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoadFileHandler implements InvocationHandler {

    ILoadFile loadFile = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这里是invoke方法...");
        if( loadFile == null){
            loadFile = new LoadFile();
        }
        System.out.println("invoke处理完，返回结果...");
        return loadFile.load();
    }
}
