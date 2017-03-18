package me.cxis.test.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by cheng.xi on 2017-03-14 10:27.
 */
public class Main {

    public static void main(String[] args){
        ILoadFile loadFile = (ILoadFile) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{ILoadFile.class},new LoadFileHandler());
        System.out.println(loadFile.load());
    }
}
