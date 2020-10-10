package 注解06_PostConstructPreDestroy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Computer {

    public Computer() {
        System.out.println("【Computer】 无参构造方法启动");
    }

    @PostConstruct
    public void init(){
        System.out.println("【Computer】 init()方法启动");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("【Computer】 destroy()方法启动");
    }
}
