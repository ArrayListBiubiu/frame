package ע��04_Import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ����� main() �����������Կ�����
 *      ��1��Pig��Pig02 ��ͨ�� Import(Pig.Class, Pig02.Class) ����ɹ���
 *      ��2��Pig03��Pig04 ��ͨ�� MyImportSelector ѡ��������ɹ���
 */
public class ImportMain {

    public static void main(String[] args) {
        ApplicationContext ac = null;
        ac = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println(2+5%2);
    }

}
