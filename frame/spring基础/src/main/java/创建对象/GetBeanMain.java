package ��������;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * ***ֻҪ����spring�����ļ���spring�Զ�new����Ӧ����***
 * ��������п��Կ�����ֻ�Ǽ�����"��������.xml"�����ļ����������Ӧ�Ĺ��췽���Ѿ�ȫ���������������Ѿ�������ϣ�
 * �������� getBean() ������ֻ�ǽ������õĶ�����������ó���ʹ�ö��ѣ�һ��Ҫ��ȷ bean ���������ڡ�
 *
 *
 */
public class GetBeanMain {

    public static void main(String[] args) {
        /**
         * ����spring�����ļ�����ȡspring������
         * ApplicationContext��һ���ӿڣ�������spring������Ҫ����ķ�����
         * ClassPathXmlApplicationContextʵ����ApplicationContext�ӿڵ�һ���࣬�����������·��ȥ���������ļ���Ȼ������spring������
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("��������.xml");
    }

}
