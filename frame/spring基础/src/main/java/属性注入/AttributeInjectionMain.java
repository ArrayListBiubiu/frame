package ����ע��;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * ����ע��ķ�ʽ
 *      ��1��set����
 *      ��2�����췽��
 *      ��3������ע��
 */
public class AttributeInjectionMain {

    public static void main(String[] args) {

        // ����spring�����ļ�����ȡspring������
        ApplicationContext ac = new ClassPathXmlApplicationContext("����ע��.xml");

        // 1.set����
        Cat01 cat01 = (Cat01) ac.getBean("cat01");
        System.out.println(cat01);

        // 2.���췽��
        Cat02 cat02 = (Cat02) ac.getBean("cat02");
        System.out.println(cat02);

        // 3.����ע��
        Cat03 cat03 = (Cat03) ac.getBean("cat03");
        System.out.println(cat03);

    }

}
