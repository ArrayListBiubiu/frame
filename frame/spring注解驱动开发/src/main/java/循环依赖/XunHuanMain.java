package ѭ������;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * ѭ������������ʾ
 *      ��1��ʹ�� xml ��ʽ
 *      ��2��ʹ��ע�ⷽʽ
 */
public class XunHuanMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ѭ������.xml");
        System.out.println("-------------------------");


        AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("=========================");

    }
}
