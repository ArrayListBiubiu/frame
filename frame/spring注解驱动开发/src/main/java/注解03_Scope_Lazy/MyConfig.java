package 注解03_Scope_Lazy;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Scope 的作用？
 *      调整作用域，
 *      @Scope("Singleton") 单实例，也是默认值，并且容器在启动的时候会直接调用注册 Bean 的方法创建对象，放入 IOC 容器中等待调用，单例 + 饿汉式
 *      @Scope("prototype") 多实例，容器在启动的时候不会创建对象，而是在获取对象（即，调用 getBean 方法）时候才去创建对象，调用几次就创建几个对象，多例 + 懒汉式
 */
@Configuration
public class MyConfig {

//    @Lazy // 使默认的饿汉式变成懒汉式
    @Scope("singleton") // 默认值就是单例的，这里为了学习过程中使用，写出来了和下边的作为对比
    @Bean
    public Bee getBee(){
        System.out.println("【MyConfig】  创建了一个Bee对象，并存储在spring缓存中等待调用。。。");
        return new Bee();
    }

    @Scope("prototype") // 多实例
    @Bean
    public Bee getBee2(){
        System.out.println("【MyConfig】  创建了一个Bee对象，并存储在spring缓存中等待调用。。。");
        return new Bee();
    }

}
