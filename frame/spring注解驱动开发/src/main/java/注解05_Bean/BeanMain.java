package ע��05_Bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * bean���������ڣ�
 *      ��ʵ����
 *           --- ����IOC������
 *          ��1�����췽����
 *          ��2����ʼ����init()��
 *           --- ������Աʹ��bean������ɶ�Ӧ������
 *          ��3�����٣�destroy()�� ������ac.clos()����ʱspring������bean��
 *      ��ʵ����
 *           --- ����IOC������
 *           --- ����getBean()��ȡ����
 *           ��1�����췽����
 *           ��2����ʼ����init()��
 *           --- ������Աʹ��bean������ɶ�Ӧ������
 *           *** ��ʵ��ʱ���������ac.clos()������spring�������ٴ���Ҳ����˵springֻ�����æ�������������Ķ���bean�Ĺ����ٲ�����
 */
public class BeanMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = null;

        // 1.��ʵ��
        // 1.1.����IOC����
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        // 1.2.��ȡ����
        Student student = (Student) ac.getBean("getStudent");
        Student student2 = (Student) ac.getBean("getStudent");
        System.out.println(student == student2);
        // 1.3.�ر�����
        ac.close();


        // 2.��ʵ��
        // 2.1.����IOC����
        ac = new AnnotationConfigApplicationContext(MyConfig02.class);
        // 2.2.��ȡ����
        Student02 student02 = (Student02) ac.getBean("getStudent02");
        Student02 student03 = (Student02) ac.getBean("getStudent02");
        System.out.println(student02 == student03);
        // 2.3.�ر�IOC����
        ac.close();
    }
}
