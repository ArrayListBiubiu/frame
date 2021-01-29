package code03;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.Field;
import java.util.Properties;


/**
 * spring aop
 * <p>
 * （1）在spring.xml配置文件加载时，会完成所有代理对象的创建过程，包括字节码文件的生成
 */
public class Main03 {
    public static void main(String[] args) throws Exception {

        saveGeneratedCglibProxyFiles("C:/Users/ArrayList_biubiu/Desktop");
        ApplicationContext ac = new ClassPathXmlApplicationContext("code03.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        calculator.add(9, 10);

    }

    public static void saveGeneratedCglibProxyFiles(String dir) throws Exception {
        Field field = System.class.getDeclaredField("props");
        field.setAccessible(true);
        Properties properties = (Properties) field.get(null);
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, dir);
        properties.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
    }
}
