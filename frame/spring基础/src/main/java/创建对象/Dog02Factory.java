package 创建对象;

/**
 * 服务于 Dog02 的实例工厂方法
 */
public class Dog02Factory {

    // 实例工厂方法
    public Dog02 getDog02() {
        System.out.println("Dog02的实例工厂方法启动。。。");
        return new Dog02("Dog02", 3);
    }

}
