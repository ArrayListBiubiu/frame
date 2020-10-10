package 创建对象;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * ***只要加载spring配置文件，spring自动new出相应对象。***
 * 从这个类中可以看到，只是加载了"创建对象.xml"配置文件，但是其对应的构造方法已经全部启动，即对象已经创建完毕，
 * 而后续的 getBean() 方法，只是将创建好的对象从容器中拿出来使用而已，一定要明确 bean 的生命周期。
 */
public class GetBeanMain {

    public static void main(String[] args) {
        /**
         * 加载spring配置文件，获取spring容器。
         * ApplicationContext是一个接口，定义了spring容器需要定义的方法。
         * ClassPathXmlApplicationContext实现了ApplicationContext接口的一个类，该类会依据类路径去查找配置文件，然后启动spring容器。
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("创建对象.xml");
    }

}
