package bean;


import org.springframework.beans.factory.FactoryBean;


/**
 * 工厂类 BlueFactoryBean ，需要实现 FactoryBean 接口，并重写方法
 */
public class BlueFactoryBean implements FactoryBean<Blue> {

    //返回 Blue 对象，并添加到容器中
    @Override
    public Blue getObject() throws Exception {
        System.out.println("getObject() 方法被调用。。。");
        return new Blue();
    }

    //返回对象的类型
    @Override
    public Class<?> getObjectType() {
        System.out.println("getObjectType() 方法被调用。。。");
        return Blue.class;
    }

    //true：单例  ，  false：多实例
    @Override
    public boolean isSingleton() {
        System.out.println("isSingleton() 方法被调用。。。");
        return true;
    }

}
