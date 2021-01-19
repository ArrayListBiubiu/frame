package code06;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean {

    // 直接返回对象
    @Override
    public Object getObject() throws Exception {
        System.out.println("MyFactoryBean 类中的 getObject() 方法启动");
        return new Computer();
    }

    // 返回类型
    @Override
    public Class<?> getObjectType() {
        System.out.println("MyFactoryBean 类中的 getObjectType() 方法启动");
        return null;
    }

    // 是否单例
    @Override
    public boolean isSingleton() {
        System.out.println("MyFactoryBean 类中的 isSingleton() 方法启动");
        return true;
    }
}
