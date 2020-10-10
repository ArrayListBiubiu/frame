package 注解01_Bean;

/**
 * xml传统方式创建对象的实体类
 */
public class Bird {

    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
