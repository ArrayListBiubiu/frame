package 注解06_PostConstructPreDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 也可以通过注解@PostConstruct、@PreDestroy实现声明周期的管理，
 *     （1）@PostConstruct是在构造方法结束之后，对bean进行初始化，
 *     （2）@PreDestroy是在bean的销毁之前执行。
 *
 * 这里有一点：
 *      （1）构造方法先执行，（2）然后@Autowire，（3）然后@PostConstruct
 */
public class PostConstructPreDestroyMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = null;
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        ac.destroy();
    }

}
