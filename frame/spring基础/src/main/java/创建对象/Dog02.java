package 创建对象;

/**
 * spring创建对象的四种方式：（二）实例工厂
 */
public class Dog02 {

    private String name;
    private Integer age;

    // 确保当前对象没有无参构造方法
    // 需要用实例工厂方法创建对象的构造方法
    public Dog02(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Dog02的有参数构造方法启动。。。");
    }
}
