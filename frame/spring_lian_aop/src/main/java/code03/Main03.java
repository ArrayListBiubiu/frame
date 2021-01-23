package code03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * spring aop
 */
public class Main03 {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("code03.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        System.out.println(calculator.add(9, 10));

    }
}
