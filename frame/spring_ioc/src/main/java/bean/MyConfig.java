package bean;


import org.springframework.context.annotation.*;


/**
 * 配置类
 *
 * @Bean() 的作用？
 *      给容器中注册一个bean，默认以方法名作为 id
 * @Bean("s") 的作用？
 *      若不想让 id 依赖于方法名，想要自定义 id 的话，可以写成 -> @Bean("s")
 * @Scope 的作用？
 *      调整作用域，
 *      @Scope("Singleton") 单实例，也是默认值，并且容器在启动的时候会直接调用注册 Bean 的方法创建对象，放入 IOC 容器中等待调用，单例 + 饿汉式
 *      @Scope("prototype") 多实例，容器在启动的时候不会创建对象，而是在获取对象（即，调用 getBean 方法）时候才去创建对象，调用几次就创建几个对象，多例 + 懒汉式
 * @Lazy 的作用？
 *      在默认模式下，是单例 + 饿汉式，通过增加 @Lazy 注解，使默认模式变成 -> 单例 + 懒汉式
 * 向容器中注册组件的几种方式？
 *      （1）包扫描 + @Controller、@Service...
 *      （2）@Bean
 *      （3）@Import
 *      （4）@FatoryBean （即，工厂 bean，之前创建的如：Person、Student...都是普通 bean）
 * @FatoryBean 的使用？
 *      创建一个工厂类，需要实现 FactoryBean 接口，重写对应的方法
 * @FatoryBean 的特点？
 *      （1）容器启动后，在获取对象的时候，实质上调用的是 BlueFactoryBean 类中的重写的 getObject() 方法
 *      （2）以 id 方式调用 getBean 方法，默认情况下
 *          Object object =  ac2.getBean("blueFactoryBean"); -> 获取的对象是 Blue，虽然 id 是 blueFactoryBean，实质上得到的是 Blue 对象
 *      （3）若非要得到 BlueFactoryBean 对象
 *          Object object =  ac2.getBean("&blueFactoryBean"); -> 获取的对象是 BlueFactoryBean ，通过在输入的 id 前，增加 & 符号，获取 BlueFactoryBean 对象
 *          Object object =  ac2.getBean(BlueFactoryBean.class); -> 直接使用 BlueFactoryBean.class
 * bean 的生命周期？
 *      创建 -> 初始化 -> 销毁
 * bean 的生命周期参数修改？
 *      （1）在实体类中自定义写好，初始化、销毁等方法
 *      （2）通过注解中添加参数，@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
 *          表示 customInit() 方法是用于 Car 的初始化方法，customDestroy() 方法是用于 Car 的销毁方法
 * bean 的生命周期中，什么时候初始化，什么时候销毁？
 *      （1）单实例（默认情况）
 *          初始化：对象创建完毕，并赋好值，才开始调用初始化方法
 *          销毁：容器关闭的时候，调用销毁的方法
 *      （2）多实例（即， @Scope("prototype")）
 *          初始化：获取对象的（即，调用 getBean 方法）时候，才开始初始化
 *          销毁：容器只负责创建这个 bean，但是不会管理这个 bean（不会主动调用销毁方法），需要手动调用销毁的方法
 */
@Configuration  //声明这是一个配置类
@ComponentScan(value = "controller")    //以注解的方式启动包扫描，扫描的包是 controller 包
@Import({Yellow.class, Blue.class})
public class MyConfig {

    //给容器中注册一个bean，默认以方法名作为 id
    @Bean()
    public Student getStudent() {
        return new Student("lisi", 30);
    }

    //id 不再以方法名作为 id ，id 为 s
    @Bean("s")
    public Student get() {
        return new Student("wangwu", 40);
    }

    //@Scope("prototype")
    @Lazy   //懒汉式
    @Bean
    public Principal getPrincipal() {
        System.out.println("diaoyong...");
        return new Principal("zhaoliu", 50);
    }

    @Bean
    public BlueFactoryBean blueFactoryBean() {
        return new BlueFactoryBean();
    }

    //测试 bean 的生命周期
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Car car() {
        return new Car();
    }

}
