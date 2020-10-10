package 创建对象;

/**
 * spring创建对象的四种方式：（一）构造方法：（无参构造）
 *                                       （有参构造）
 */
public class Dog01 {

    private String name;
    private Integer age;

    // 1. 验证无参数构造方法可以获取对象
    public Dog01() {
        System.out.println("Dog01的无参数构造方法启动。。。");
    }

    // 2. 验证有参数构造方法可以获取对象
    public Dog01(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Dog01的有参数构造方法启动。。。");
    }

    @Override
    public String toString() {
        return "Dog01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
