package ע��02_ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ע��02_ComponentScan.a.Person;
import ע��02_ComponentScan.b.MyConfig;
import ע��02_ComponentScan.b.Person02;

public class ComponentScanMain {

    public static void main(String[] args) {

        // ***���� ac�����¹���һ������***
        ApplicationContext ac = null;

        // 1.���� xml ��ʽʵ�ְ�ɨ�� -> package1
        ac = new ClassPathXmlApplicationContext("ע��02_ComponentScan.xml");
        Person person01 = (Person) ac.getBean("person");
        System.out.println(person01);

        // 2.���� @ComponentScan ��ʽʵ�ְ�ɨ�� -> package2
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Person02 person02 = (Person02) ac.getBean("person02");
        System.out.println(person02);

    }

}
