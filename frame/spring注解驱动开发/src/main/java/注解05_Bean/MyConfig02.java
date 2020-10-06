package ע��05_Bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig02 {

    // ����һ����ʵ��bean
    @Scope("prototype") // ��ʵ��
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Student02 getStudent02(){
        return new Student02();
    }

}
