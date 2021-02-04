package code05;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    // 重写构造方法，否则默认调用父类无参构造，那是一个空方法
    public MyClassPathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    // 自定义beanFactory
    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        setAllowBeanDefinitionOverriding(false);
        setAllowCircularReferences(false);
        super.customizeBeanFactory(beanFactory); // 需要调用 super 的方法，否则这里会出现递归的死循环
    }

}
