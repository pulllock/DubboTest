package me.cxis.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cheng.xi on 2017-03-14 10:26.
 */
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
