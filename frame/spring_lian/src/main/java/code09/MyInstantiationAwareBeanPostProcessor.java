package code09;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("【MyInstantiationAwareBeanPostProcessor】 --- postProcessAfterInitialization() 被调用");
        Cup cup = null;
        if (bean instanceof Cup) {
            cup = (Cup) bean;
            cup.setName("大大的杯子");
            return false;
        } else {
            return true;
        }
    }
}
