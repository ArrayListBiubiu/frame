package 注解03_Scope_Lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 在 @Scope("singleton") 和 @Scope("prototype") 模式下，不仅区别体现在单例和多例
 * 还有就是：
 *      在 singleton 模式下，加载 MyConfig.class 配置类，会立刻创建 bean 对象后存储在spring的缓存中，下次调用 getBean() 方法时，只要从缓存中获取即可，
 *          所以在日志中体现的是，
 *          当调用 new AnnotationConfigApplicationContext(MyConfig.class) 方法时会立刻触发构造方法，输出对应的日志，
 *          之后再次调用 getBean() 方法时不会有任何日志输出；
 *
 *      在 prototype 模式下，加载 MyConfig.class 配置类，不会立刻创建 bean 对象，需要等待下次调用 getBean() 方法时，才会创建一个新的 bean 对象，
 *          所以在日志中体现的是，
 *          当调用 new AnnotationConfigApplicationContext(MyConfig.class) 方法时，不会有任何的日志输出，
 *          之后调用 getBean() 方法时才会触发 Bean 实体类的构造方法，创建一个新的对象，
 *          当然每一次调用 getBean() 方法时都会触发 Bean 实体类的构造方法；
 * 小bug记录：
 *      我在当前 demo 中，为了验证 prototype 模式的"多例懒加载"，就把 "ac.getBean("getBee")" 方法注释掉了，
 *      但是发现执行 "new AnnotationConfigApplicationContext(MyConfig.class)"方法时仍然会触发构造方法，创建一个对象，
 *      原因是因为，我还需要注释掉 "MyConfig" 配置类中关于 singleton 的 @Bean。
 */
public class ScopeLazyMain {

    public static void main(String[] args) {
        // 声明 ApplicationContext 对象
        ApplicationContext ac = null;

        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Bee bee = (Bee) ac.getBean("getBee");
        Bee bee2 = (Bee) ac.getBean("getBee");
        // 在 @Scope("singleton") 下（即在默认情况下），是单利的  bee == bee2
        System.out.println(bee == bee2);

        Bee bee3 = (Bee) ac.getBean("getBee2");
        Bee bee4 = (Bee) ac.getBean("getBee2");
        // 在 @Scope("prototype") 下（即在默认情况下），是多利的  bee3 != bee4
        System.out.println(bee3 == bee4);


    }

}
