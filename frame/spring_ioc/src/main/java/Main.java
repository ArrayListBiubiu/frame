import bean.*;
import book.service.BookDao;
import book.service.BookService;
import controller.MyController;
import controller.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 启动类
 */
public class Main {

    public static void main(String[] args) {

        //配置文件，的方式获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);

        //配置类，的方式获取对象
        AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(MyConfig.class);
        Student student = (Student) ac2.getBean("getStudent");  //方法名作为默认 id
        System.out.println(student);
        Student student2 = (Student) ac2.getBean("s");  //自定义 id
        System.out.println(student2);

        //配置文件，的方式实现包扫描
        MyController myController = ac.getBean(MyController.class); //ac 的获取需要通过，spring.xml
        myController.method();

        //配置类，的方式实现包扫描
        MyService myService = ac2.getBean(MyService.class); //ac2 的获取需要通过，配置类MyConfig
        myService.method();

        //测试一： @Scope 注解，这里是由于在注册 bean 的时候设置为 @Scope("prototype") ，即多实例，所以返回 false
        /*
            测试二：
            正常默认模式是 单例 + 饿汉式，通过在注册 bean 的时候增加 @Lazy 注解，变成 单例 + 懒汉式
            没有 @Lazy 注解时，输出日志书序：
                （1）diaoyong...  （2）123  （3）456
            有 @Lazy 注解时，输出日志书序：
                （1）123  （2）diaoyong...  （3）456
         */
        Principal principal = (Principal) ac2.getBean("getPrincipal");
        Principal principal2 = (Principal) ac2.getBean("getPrincipal");
        System.out.println(principal == principal2);

        /*
            测试 @Import ，实现快速向容器中注册组件
            没有 @Import
                输出日志中没有，bean.Yellow、bean.Blue
            有 @Import
                输出日志中有，bean.Yellow、bean.Blue
         */
        String[] beans = ac2.getBeanDefinitionNames();
        for (String string : beans) {
            System.out.println(string);     //输出容器中有什么组件被注册，以 id 的形式返回
        }

        /*
            测试 @FatoryBean ，实现快速向容器中注册组件
                默认情况下，虽然 id 是 blueFactoryBean ，但是返回的是 Blue 对象
                可以通过在输入的 id 前，增加 & 符号，获取 BlueFactoryBean 对象
         */
        Object object =  ac2.getBean("blueFactoryBean");
        System.out.println(object);
        Object object2 =  ac2.getBean("&blueFactoryBean");
        System.out.println(object2);
    }

    //测试 bean 的生命周期
    @Test
    public void test() {
        //创建 IOC 容器
        AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("IOC 容器创建完成。。。");

        //关闭 IOC 容器
        ac2.close();
    }


    //测试 @Autowired 自动注入，这里用的配置类是 MyConfig2
    @Test
    public void test2() {
        //创建 IOC 容器
        ApplicationContext ac2 = new AnnotationConfigApplicationContext(MyConfig2.class);
        BookService bookService = ac2.getBean(BookService.class);
        System.out.println(bookService);
        BookDao bookDao = (BookDao) ac2.getBean("bookDao");
        System.out.println(bookDao);    //可以看到导入的 bookService 的成员变量，与 bookDao 对象完全相同

        //验证 @Autowired 自动注入的匹配顺序
        bookService.method();
    }

}


