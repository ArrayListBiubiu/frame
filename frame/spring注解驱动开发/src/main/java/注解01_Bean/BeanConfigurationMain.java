package ע��01_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 1.���ڴ�ͳ��ʽ��ȡ bean ����Ҳ����˵����spring������ע�� bean ����
 * 2.���� @Bean ע�⣬�����������
 */
public class BeanConfigurationMain {

    public static void main(String[] args) {
        // ***���� ac�����¹���һ������***
        ApplicationContext ac = null;

        // 1.���ڴ�ͳ��ʽ��ȡ bean ����
        ac = new ClassPathXmlApplicationContext("ע��01_Bean.xml");
        Bird bird01 = (Bird) ac.getBean("bird01");
        System.out.println(bird01);

        // 2.���� @Bean ��ȡ bean ����
        // ��1��ac.getBean()������ȡ���������ǣ�@Bean���εķ����ķ���ֵ�����ͣ�
        // ��2��idĬ��ʹ�÷�������Ϊid��   Ҳ����ʹ�����ֵ�����id -> @Bean("birddddd")��
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Bird02 bird02 = (Bird02) ac.getBean("getBird02");
        System.out.println(bird02);

        System.out.println("------------------------------------");
        System.out.println(ac.getBeanDefinitionCount());
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }




    }

}
