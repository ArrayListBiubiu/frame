package ioc.code08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main08 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("code08.xml");
    }
}
