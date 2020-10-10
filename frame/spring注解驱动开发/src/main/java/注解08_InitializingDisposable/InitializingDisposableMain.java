package ע��08_InitializingDisposable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * bean �ĳ�ʼ���������߼���
 * ���� @InitializingBean �� @DisposableBean ���� bean �ĳ�ʼ���������߼�
 */
public class InitializingDisposableMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(ac.getBean(Car.class));

    }

}
