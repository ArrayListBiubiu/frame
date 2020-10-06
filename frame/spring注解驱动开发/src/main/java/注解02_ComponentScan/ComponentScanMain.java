package 注解02_ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import 注解02_ComponentScan.a.Person;
import 注解02_ComponentScan.b.MyConfig;
import 注解02_ComponentScan.b.Person02;

public class ComponentScanMain {

    public static void main(String[] args) {

        // ***声明 ac，以下共用一个变量***
        ApplicationContext ac = null;

        // 1.利用 xml 方式实现包扫描 -> package1
        ac = new ClassPathXmlApplicationContext("注解02_ComponentScan.xml");
        Person person01 = (Person) ac.getBean("person");
        System.out.println(person01);

        // 2.利用 @ComponentScan 方式实现包扫描 -> package2
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Person02 person02 = (Person02) ac.getBean("person02");
        System.out.println(person02);

    }

}
