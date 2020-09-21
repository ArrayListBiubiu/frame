package 属性注入;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 属性注入的方式
 *      （1）set方法
 *      （2）构造方法
 *      （3）基于注解
 */
public class AttributeInjectionMain {

    public static void main(String[] args) {

        // 加载spring配置文件，获取spring容器。
        ApplicationContext ac = new ClassPathXmlApplicationContext("属性注入.xml");

        // 1.set方法
        Cat01 cat01 = (Cat01) ac.getBean("cat01");
        System.out.println(cat01);

        // 2.构造方法
        Cat02 cat02 = (Cat02) ac.getBean("cat02");
        System.out.println(cat02);

        // 3.基于注解
        Cat03 cat03 = (Cat03) ac.getBean("cat03");
        System.out.println(cat03);

    }

}
