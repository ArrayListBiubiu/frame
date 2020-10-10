package 注解07_BeanPostProcessor;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Monkey {
    public Monkey() {
    }

    @PostConstruct
    public void init() {
        System.out.println("【Monkey】 init()方法启动");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("【Monkey】 destroy()方法启动");
    }


}
