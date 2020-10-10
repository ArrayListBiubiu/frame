package 注解08_InitializingDisposable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car implements InitializingBean, DisposableBean {

    public Car() {
        System.out.println("【Car】 无参构造方法启动");
    }

    // bean 实例化和初始化完成之后调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【Car】 afterPropertiesSet()方法启动");
    }

    // bean 销毁之前调用
    @Override
    public void destroy() throws Exception {
        System.out.println("【Car】 destroy()方法启动");
    }


}
