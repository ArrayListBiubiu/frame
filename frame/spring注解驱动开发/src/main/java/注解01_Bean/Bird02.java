package 注解01_Bean;


/**
 * 服务于利用 @Bean 获取对象方式的的实体类
 */
public class Bird02 {

    private String name;
    private int age;

    public Bird02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird02{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
