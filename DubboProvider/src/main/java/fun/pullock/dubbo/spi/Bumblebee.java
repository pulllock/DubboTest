package fun.pullock.dubbo.spi;

public class Bumblebee implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Bumblebee.");
    }
}
