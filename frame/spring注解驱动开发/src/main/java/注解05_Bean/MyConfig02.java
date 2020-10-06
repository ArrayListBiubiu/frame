package 注解05_Bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig02 {

    // 创建一个多实例bean
    @Scope("prototype") // 多实例
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Student02 getStudent02(){
        return new Student02();
    }

}
