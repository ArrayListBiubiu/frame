package 注解01_Bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Bird02 getBird02(){
        return new Bird02("老鹰", 3);
    }

}
