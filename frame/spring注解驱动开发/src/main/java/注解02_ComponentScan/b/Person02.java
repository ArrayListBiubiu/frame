package 注解02_ComponentScan.b;


import org.springframework.stereotype.Controller;

/**
 * 服务于利用@ComponentScan方式实现包扫描
 */
@Controller
public class Person02 {

    private String name;
    private int age;

    public Person02() {
    }

    @Override
    public String toString() {
        return "Person02{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
