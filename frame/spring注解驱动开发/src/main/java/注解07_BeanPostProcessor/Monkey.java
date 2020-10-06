package ע��07_BeanPostProcessor;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Monkey {
    public Monkey() {
    }

    @PostConstruct
    public void init() {
        System.out.println("��Monkey�� init()��������");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("��Monkey�� destroy()��������");
    }


}
