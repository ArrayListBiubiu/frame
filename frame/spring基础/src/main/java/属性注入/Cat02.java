package 属性注入;


/**
 * 属性注入的方式：（二）构造方法
 */
public class Cat02 {

    private String name;
    private Integer age;

    public Cat02(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Cat02的有参构造方法启动。。。");
    }

    @Override
    public String toString() {
        return "Cat01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
