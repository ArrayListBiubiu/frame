package 注解04_Import;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * 通过 @Import 实现 Bean 的注入，这种方案也是会更加方便一些，并且在 springboot 中被广泛应用
 *      （1）可以直接传入 Class；
 *      （2）也可以通过选择器，自定义的传入 Class；
 */
@Import({Pig.class, Pig02.class, MyImportSelector.class})
@Configuration
public class MyConfig {

}
