package ע��02_ComponentScan.a;


import org.springframework.stereotype.Controller;

/**
 * ����������xml��ͳ��ʽʵ�ְ�ɨ��
 */
@Controller
public class Person {

    private String name;
    private int age;

    public Person() {

    }

    // ???
    // @Controller һ��Ҫ���޲ι��죬ԭ����ʱ����ȷ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
