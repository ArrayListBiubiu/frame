package ע��03_Scope_Lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * �� @Scope("singleton") �� @Scope("prototype") ģʽ�£��������������ڵ����Ͷ���
 * ���о��ǣ�
 *      �� singleton ģʽ�£����� MyConfig.class �����࣬�����̴��� bean �����洢��spring�Ļ����У��´ε��� getBean() ����ʱ��ֻҪ�ӻ����л�ȡ���ɣ�
 *          ��������־�����ֵ��ǣ�
 *          ������ new AnnotationConfigApplicationContext(MyConfig.class) ����ʱ�����̴������췽���������Ӧ����־��
 *          ֮���ٴε��� getBean() ����ʱ�������κ���־�����
 *
 *      �� prototype ģʽ�£����� MyConfig.class �����࣬�������̴��� bean ������Ҫ�ȴ��´ε��� getBean() ����ʱ���Żᴴ��һ���µ� bean ����
 *          ��������־�����ֵ��ǣ�
 *          ������ new AnnotationConfigApplicationContext(MyConfig.class) ����ʱ���������κε���־�����
 *          ֮����� getBean() ����ʱ�Żᴥ�� Bean ʵ����Ĺ��췽��������һ���µĶ���
 *          ��Ȼÿһ�ε��� getBean() ����ʱ���ᴥ�� Bean ʵ����Ĺ��췽����
 * Сbug��¼��
 *      ���ڵ�ǰ demo �У�Ϊ����֤ prototype ģʽ��"����������"���Ͱ� "ac.getBean("getBee")" ����ע�͵��ˣ�
 *      ���Ƿ���ִ�� "new AnnotationConfigApplicationContext(MyConfig.class)"����ʱ��Ȼ�ᴥ�����췽��������һ������
 *      ԭ������Ϊ���һ���Ҫע�͵� "MyConfig" �������й��� singleton �� @Bean��
 */
public class ScopeLazyMain {

    public static void main(String[] args) {
        // ���� ApplicationContext ����
        ApplicationContext ac = null;

        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Bee bee = (Bee) ac.getBean("getBee");
        Bee bee2 = (Bee) ac.getBean("getBee");
        // �� @Scope("singleton") �£�����Ĭ������£����ǵ�����  bee == bee2
        System.out.println(bee == bee2);

        Bee bee3 = (Bee) ac.getBean("getBee2");
        Bee bee4 = (Bee) ac.getBean("getBee2");
        // �� @Scope("prototype") �£�����Ĭ������£����Ƕ�����  bee3 != bee4
        System.out.println(bee3 == bee4);


    }

}
