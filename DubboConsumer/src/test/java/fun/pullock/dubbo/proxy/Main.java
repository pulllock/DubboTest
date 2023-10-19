package fun.pullock.dubbo.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args){
        ILoadFile loadFile = (ILoadFile) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{ILoadFile.class},new LoadFileHandler());
        System.out.println(loadFile.load());
    }
}
