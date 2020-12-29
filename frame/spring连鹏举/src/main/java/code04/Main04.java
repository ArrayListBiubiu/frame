package code04;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * doCreateBean()方法中的applyMergedBeanDefinitionPostProcessors()是用于完成，@PostConstruct、@PreDestroy、@Autowired、@Value等注解的注册功能。
 */
public class Main04 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("code04.xml");
//        Student student = (Student) ac.getBean("student");
//        System.out.println(student);
//        ac.close();
    }
}
