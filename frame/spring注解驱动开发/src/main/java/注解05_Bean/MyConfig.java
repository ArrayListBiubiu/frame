package 注解05_Bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    // 创建一个单实例bean
    // （1）利用 initMethod = "init" 指定初始化bean方法
    // （2）利用 destroyMethod = "destroy" 指定销毁bean方法
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student getStudent() {
        return new Student();
    }

}
