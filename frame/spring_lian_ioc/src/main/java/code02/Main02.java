package code02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 在多例模式下每一次都需要创建新的bean对象，因为一个类中可能存在多个构造方法，所以需要根据 "配置文件中的参数" 或 "传入的参数" 来确定最终需要调用的构造方法，
 * spring容器通过解析，将确定好的构造函数缓存到 BeanDefinition 中的 resolvedConstructorOrFactoryMethod 属性中，在下次需要相同的构造方法时，直接从缓存中获取。
 *
 * 例如在本案例中，需要创建2个Person对象，第一次getBean()的时候，在createBeanInstance()方法中有如下代码：
 *      if (mbd.resolvedConstructorOrFactoryMethod != null) {
 *          resolved = true;
 * 			autowireNecessary = mbd.constructorArgumentsResolved;
 *      }
 * resolvedConstructorOrFactoryMethod 一定是null，但是第二次 getBean() 的时候，resolvedConstructorOrFactoryMethod就不是null了
 *
 * 构造器的排序，（1）权限，public优先  （2）参数个数，多的优先
 */
public class Main02 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("code02.xml");
        Person person  = ac.getBean(Person.class);
        Person person2 = ac.getBean(Person.class);
        System.out.println(person==person2);
    }
}
