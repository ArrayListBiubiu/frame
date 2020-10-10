package 循环依赖;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XunhuanMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("循环依赖.xml");
        System.out.println("---------------------------");


        AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("===========================");


    }
}
