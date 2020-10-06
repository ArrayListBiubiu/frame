package 注解04_Import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 从这个 main() 方法启动可以看出，
 *      （1）Pig、Pig02 是通过 Import(Pig.Class, Pig02.Class) 导入成功；
 *      （2）Pig03、Pig04 是通过 MyImportSelector 选择器导入成功；
 */
public class ImportMain {

    public static void main(String[] args) {
        ApplicationContext ac = null;
        ac = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println(2+5%2);
    }

}
