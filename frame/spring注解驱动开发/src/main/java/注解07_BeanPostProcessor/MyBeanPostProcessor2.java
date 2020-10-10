package 注解07_BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor 接口是一个后置处理器，初始化前后进行的工作
 */
@Component
public class MyBeanPostProcessor2 implements BeanPostProcessor {

    // bean 初始化之前被调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【MyBeanPostProcessor2】 postProcessBeforeInitialization()方法启动");
        return bean;
    }

    // bean 初始化之后被调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【MyBeanPostProcessor2】 postProcessAfterInitialization()方法启动");
        return bean;
    }
}
