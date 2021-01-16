package code04;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
public class Student {

    int id;
    String name;
    String gender;

//    @Autowired
//    Teacher teacher;

//    @Autowired
//    static Teacher teacher2;

//    @Autowired
//    void method(){}

//    @Autowired
//    static void Method2(){}


    @PostConstruct
    public void initing(){
        System.out.println("【code04.Student】 initing()方法启动");
    }

    @PreDestroy
    public void destroying(){
        System.out.println("【code04.Student】 destroying()方法启动");
    }
}
