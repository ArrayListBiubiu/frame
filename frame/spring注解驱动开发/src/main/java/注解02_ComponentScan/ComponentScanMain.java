package 娉ㄨВ02_ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import 娉ㄨВ02_ComponentScan.a.Person;
import 娉ㄨВ02_ComponentScan.b.MyConfig;
import 娉ㄨВ02_ComponentScan.b.Person02;

public class ComponentScanMain {

    public static void main(String[] args) {

        // ***澹版槑 ac锛屼互涓嬪叡鐢ㄤ竴涓彉閲�***
        ApplicationContext ac = null;

        // 1.鍒╃敤 xml 鏂瑰紡瀹炵幇鍖呮壂鎻� -> package1
        ac = new ClassPathXmlApplicationContext("娉ㄨВ02_ComponentScan.xml");
        Person person01 = (Person) ac.getBean("person");
        System.out.println(person01);

        // 2.鍒╃敤 @ComponentScan 鏂瑰紡瀹炵幇鍖呮壂鎻� -> package2
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Person02 person02 = (Person02) ac.getBean("person02");
        System.out.println(person02);

    }

}
