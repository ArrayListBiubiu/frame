package 注解02_ComponentScan.a;


import org.springframework.stereotype.Controller;

/**
 * 服务于利用xml传统方式实现包扫描
 */
@Controller
public class Person {

    private String name;
    private int age;

    public Person() {

    }

    // ???
    // @Controller 一定要有无参构造，原因暂时不明确
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
