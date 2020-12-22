package code03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("code03-${username}.xml");
        Student student = ac.getBean(Student.class);
        System.out.println(student);
    }
}
