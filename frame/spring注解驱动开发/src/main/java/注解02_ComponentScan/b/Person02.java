package ע��02_ComponentScan.b;


import org.springframework.stereotype.Controller;

/**
 * ����������@ComponentScan��ʽʵ�ְ�ɨ��
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
