package 注解07_BeanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        ac.destroy();
    }
}
