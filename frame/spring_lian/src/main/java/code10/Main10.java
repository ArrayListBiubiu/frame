package code10;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main10 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("code10.xml");
        A bean = ac.getBean(A.class);
        System.out.println(bean);
    }
}
