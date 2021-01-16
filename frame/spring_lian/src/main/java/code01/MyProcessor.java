package code01;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;


/**
 * 自定义的MyInstantiationAwareBeanPostProcessor类，实现InstantiationAwareBeanPostProcessor接口，
 * 因为InstantiationAwareBeanPostProcessor接口又继承了BeanPostProcessor接口，所以需要重现以上2个接口所有方法（共5个）
 */
public class MyProcessor implements InstantiationAwareBeanPostProcessor {


    /**
     * 实现 BeanPostProcessor 接口
     */
    // 第七次调用后置处理器
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("***111***beanName：" + beanName);
        return bean;
    }

    // 第八次调用后置处理器
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("***222***beanName：" + beanName);
        return bean;
    }


    /**
     * 实现 InstantiationAwareBeanPostProcessor 接口
     */
    // 第一次调用后置处理器
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("***333***beanName：" + beanName);
        if (beanClass == Dog.class) {

            /** 使用cglib实现动态代理，创建一个代理对象 object */
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(beanClass);
            enhancer.setCallback(new MyInterceptor());
            Object object = enhancer.create();
            return object;
        }
        return null;
    }

    // 第五次调用后置处理器
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("***444***beanName：" + beanName);
        return true;
    }

    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("***555***beanName：" + beanName);
        return pvs;
    }


}
