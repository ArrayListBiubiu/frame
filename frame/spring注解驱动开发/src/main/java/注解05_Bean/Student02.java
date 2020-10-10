package 注解05_Bean;


/**
 * 用于创建多实例bean
 */
public class Student02 {

    public Student02() {
        System.out.println("【Student02】 无参构造方法启动");
    }

    public void init() {
        System.out.println("【Student02】 init()方法启动");
    }

    public void destroy() {
        System.out.println("【Student02】 destroy()方法启动");
    }
}
