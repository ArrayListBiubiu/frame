package 注解01_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 1.基于传统方式获取 bean 对象，也可以说是向spring容器中注册 bean 对象
 * 2.利用 @Bean 注解，完成上述功能
 */
public class BeanConfigurationMain {

    public static void main(String[] args) {
        // ***声明 ac，以下共用一个变量***
        ApplicationContext ac = null;

        // 1.基于传统方式获取 bean 对象
        ac = new ClassPathXmlApplicationContext("注解01_Bean.xml");
        Bird bird01 = (Bird) ac.getBean("bird01");
        System.out.println(bird01);

        // 2.利用 @Bean 获取 bean 对象
        // （1）ac.getBean()方法获取到的类型是，@Bean修饰的方法的返回值的类型，
        // （2）id默认使用方法名作为id；   也可以使用显现的声明id -> @Bean("birddddd")；
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
