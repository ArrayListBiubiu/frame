package code03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 传入的参数： code03-${username}.xml
 * 配置文件名： code03-ArrayList_biubiu.xml
 *
 * 结论：
 *      （1）${} 不仅可以用在文件内中，也可以为文件名赋值
 *      （2）允许嵌套使用，如${...${xx}...}
 *          setConfigLocations(configLocations) -> parseStringValue() 方法中递归调用了 parseStringValue()，即允许嵌套使用 ${}
 */
public class Main03 {

    @Autowired
    private static Student student1111111111;

    @Autowired
    private void run(){}

    @Autowired
    private static void run2(){}


    public static void main(String[] args) throws ParseException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("code03-${username}.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
        ac.close();
    }
}
