package bean;


import book.service.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * @Autowired 的理解？
 *      （1）默认优先按照组件的类型去寻找，
 *          比如，@Autowired BookDao bookDao; 时，优先以变量属性 BookDao 类进行匹配
 *          （1）匹配到一个，正常赋值
 *          （2）没有匹配到，抛出异常
 *          （3）匹配到多个，再根据 变量名作为 id 继续进行匹配
 *          注：什么时候回匹配到多个？
 *          （1）有一个 BookDao ，还要一个类 BookDaoExtends 继承了 BookDao ，这样就会匹配到多个 BookDao
 *          （2）有一个是以 @Repository + 包扫描的方式，还有一个是以 @Bean 的方式，这样就会匹配到多个 BookDao
 *              （1）BookDao 类的默认 id 是 bookDao
 *              （2）BookDaoExtends 类的默认 id 是 bookDaoExtends
 *              （3）他们都与 bookDao 进行匹配，所以最终会匹配到 BookDao。。。
 *      （2）默认情况下，必须装配成功，否则报错，不允许出现 NoSuchBeanDefinitionException 等情况
 *          @Autowired(required = false)
 *          默认 required = true ，必须装配成功，required = false 允许出现空指针的情况（1.找不到对应类，2.找不到对应 id）
 * @Qualifier 的作用？
 *      明确组件 id，而不是使用属性名
 * @Primary 的作用？
 *      这个案例中出现对于 BookDao 类而言，有三种注册过程
 *      （1）@Bean
 *      （2）包扫描 + @Repository + BookDao 类
 *      （2）包扫描 + @Repository + BookDaoExtends 类（BookDao 的子类）
 *      而 @Primary 作用是，在通过 @Autowired BookDao bookDao; 自动装配时，优先采用 @Bean 的方式
 */
@Configuration
@ComponentScan(value = "book.service")
public class MyConfig2 {

    @Primary    //自动装配的时候，优先采用这个 bean
    @Bean(value = "book")
    public BookDao bookDao() {
        return new BookDao();
    }

}
