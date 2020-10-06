package ע��06_PostConstructPreDestroy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Computer {

    public Computer() {
        System.out.println("��Computer�� �޲ι��췽������");
    }

    @PostConstruct
    public void init(){
        System.out.println("��Computer�� init()��������");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("��Computer�� destroy()��������");
    }
}
