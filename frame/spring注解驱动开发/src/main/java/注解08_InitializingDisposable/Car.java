package ע��08_InitializingDisposable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car implements InitializingBean, DisposableBean {

    public Car() {
        System.out.println("��Car�� �޲ι��췽������");
    }

    // bean ʵ�����ͳ�ʼ�����֮�����
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("��Car�� afterPropertiesSet()��������");
    }

    // bean ����֮ǰ����
    @Override
    public void destroy() throws Exception {
        System.out.println("��Car�� destroy()��������");
    }


}
