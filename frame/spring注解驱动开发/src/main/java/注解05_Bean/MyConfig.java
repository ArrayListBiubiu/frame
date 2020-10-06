package ע��05_Bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    // ����һ����ʵ��bean
    // ��1������ initMethod = "init" ָ����ʼ��bean����
    // ��2������ destroyMethod = "destroy" ָ������bean����
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student getStudent() {
        return new Student();
    }

}
