package bean;


/**
 * 实体类 Car，用于测试 bean 的生命周期
 */
public class Car {
    public Car() {
        System.out.println("Car  构造方法。。。");
    }

    public void customInit() {
        System.out.println("Car  初始化。。。");
    }

    public void customDestroy() {
        System.out.println("Car  销毁  。。。");
    }
}
