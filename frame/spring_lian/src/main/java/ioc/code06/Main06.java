package ioc.code06;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * FactoryBean会创建2个对象：
 *      （1）实现FactoryBean接口的子类对象 - MyFactoryBean；
 *      （2）调用重写的getObject()方法得到的对象 - Computer；
 * 但是主要区别在于，
 *      （1）MyFactoryBean会存储于一级缓存singletonObjects中， key：myFactoryBean， value：MyFactoryBean；
 *      （2）Computer会存储于factoryBeanObjectCache中，       key：myFactoryBean， value：Computer；
 *      也就是说，这2个对象spring框架都会管理，但是分别存储在不同的集合中，beanName都是相同的，但是映射的bean对象不同。
 *
 * 在加载spring.xml配置文件的时候，容器只会创建MyFactoryBean对象，Computer对象是还没有生成的，当然getObject()方法也没有调用过，
 * 只有在调用ac.getBean()方法时，才会去创建Computer对象，并放入缓存中，下次直接从factoryBeanObjectCache缓存中获取即可，
 * 但是如果Computer对象不是单例的（重写isSingleton()方法，返回false就修改了），那么每次都会创建一个新对象，也不会放入换存放入缓存中。
 *
 * ac.getBean("&myFactoryBean")  ->  获取MyFactoryBean对象
 * ac.getBean("myFactoryBean")   ->  获取Computer对象
 */
public class Main06 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("code06.xml");

        Mouse mouse = (Mouse) ac.getBean("mouse");
        System.out.println(mouse);

        MyFactoryBean myFactoryBean = (MyFactoryBean) ac.getBean("&myFactoryBean");
        System.out.println(myFactoryBean);

        Computer computer = (Computer) ac.getBean("myFactoryBean");
        System.out.println(computer);
    }
}
