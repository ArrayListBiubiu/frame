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
        setAllowBeanDefinitionOverriding(false); // 默认值是true，这里修改为false
        setAllowCircularReferences(false); // 默认值是true，这里修改为false
        customizeBeanFactory(beanFactory);
    }

}
