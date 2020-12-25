package code03;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.reflect.Method;

@Data
public class Student {

    int id;
    String name;
    String gender;

    @Autowired
    Teacher teacher;

//    @Autowired
//    static Teacher teacher2;

//    @Autowired
//    void method(){}

    @Autowired
    static void Method2(){}


    @PostConstruct

    public void initinit(){
        System.out.println("【Computer】 init()方法启动");
    }

    @PreDestroy
    public void destroydestory(){
        System.out.println("【Computer】 destroy()方法启动");
    }
}
