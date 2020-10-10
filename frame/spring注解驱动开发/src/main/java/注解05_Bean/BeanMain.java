package 注解05_Bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * bean的生命周期：
 *      单实例：
 *           --- 创建IOC容器；
 *          （1）构造方法；
 *          （2）初始化，init()；
 *           --- 开发人员使用bean对象，完成对应工作；
 *          （3）销毁，destroy()， 当调用ac.clos()方法时spring会销毁bean；
 *      多实例：
 *           --- 创建IOC容器；
 *           --- 调用getBean()获取对象；
 *           （1）构造方法；
 *           （2）初始化，init()；
 *           --- 开发人员使用bean对象，完成对应工作；
 *           *** 多实例时，即便调用ac.clos()方法，spring不做销毁处理，也可以说spring只负责帮忙创建对象，其他的对于bean的管理不再参与了
 */
public class BeanMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = null;

        // 1.单实例
        // 1.1.创建IOC容器
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        // 1.2.获取对象
        Student student = (Student) ac.getBean("getStudent");
        Student student2 = (Student) ac.getBean("getStudent");
        System.out.println(student == student2);
        // 1.3.关闭容器
        ac.close();


        // 2.多实例
        // 2.1.创建IOC容器
        ac = new AnnotationConfigApplicationContext(MyConfig02.class);
        // 2.2.获取对象
        Student02 student02 = (Student02) ac.getBean("getStudent02");
        Student02 student03 = (Student02) ac.getBean("getStudent02");
        System.out.println(student02 == student03);
        // 2.3.关闭IOC容器
        ac.close();
    }
}
