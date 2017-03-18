package me.cxis.test.proxy;

/**
 * Created by cheng.xi on 2017-03-14 10:26.
 */
public class LoadFile implements ILoadFile{

    String fileContent = "";

    public LoadFile(){
        try{
            //这里模拟加载一个大文件，需要时间很长
            System.out.println("这里要加载文件，需要很长时间");
            Thread.sleep(10000);
            System.out.println("加载完了，花费10秒");
            //加载完之后
            fileContent = "file contents...";
        }catch(Exception e){

        }
    }

    @Override
    public String load() {
        return fileContent;
    }
}
