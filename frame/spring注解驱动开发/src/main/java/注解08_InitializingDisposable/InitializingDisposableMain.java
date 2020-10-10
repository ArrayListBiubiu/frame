package 注解08_InitializingDisposable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * bean 的初始化和销毁逻辑：
 * 利用 @InitializingBean 和 @DisposableBean 定义 bean 的初始化和销毁逻辑
 */
public class InitializingDisposableMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(ac.getBean(Car.class));

    }

}
