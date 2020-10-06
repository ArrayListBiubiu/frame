package 注解07_BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 后置处理器，初始化前后进行的工作
 */
@Component // 加入到容器中
public class MyBeanPostProcessor implements BeanPostProcessor {

    // bean实例初始化之前被调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【MyBeanPostProcessor】 postProcessBeforeInitialization()方法启动");
        System.out.println("***" + bean);
        System.out.println("***" + beanName);
        return bean;
    }

    // bean实例初始化之后被调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【MyBeanPostProcessor】 postProcessAfterInitialization()方法启动");
        System.out.println("===" + bean);
        System.out.println("===" + beanName);
        return bean;
    }
}
