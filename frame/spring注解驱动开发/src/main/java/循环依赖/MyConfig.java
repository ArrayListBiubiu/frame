package 循环依赖;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@ComponentScan(value = "循环依赖")
@Configuration
public class MyConfig {
}
