package ×¢½â07_BeanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = null;
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        ac.destroy();
    }
}
