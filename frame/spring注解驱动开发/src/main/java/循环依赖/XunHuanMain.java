package 循环依赖;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 循环依赖代码演示
 *      （1）使用 xml 方式
 *      （2）使用注解方式
 */
public class XunHuanMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("循环依赖.xml");
        System.out.println("-------------------------");


        AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("=========================");

    }
}
