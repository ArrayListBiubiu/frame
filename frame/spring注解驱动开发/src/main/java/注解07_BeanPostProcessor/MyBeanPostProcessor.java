package ע��07_BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * ���ô���������ʼ��ǰ����еĹ���
 */
@Component // ���뵽������
public class MyBeanPostProcessor implements BeanPostProcessor {

    // beanʵ����ʼ��֮ǰ������
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("��MyBeanPostProcessor�� postProcessBeforeInitialization()��������");
        System.out.println("***" + bean);
        System.out.println("***" + beanName);
        return bean;
    }

    // beanʵ����ʼ��֮�󱻵���
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("��MyBeanPostProcessor�� postProcessAfterInitialization()��������");
        System.out.println("===" + bean);
        System.out.println("===" + beanName);
        return bean;
    }
}
