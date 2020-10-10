package 注解05_Bean;


/**
 * 用于创建单实例bean
 */
public class Student {

    public Student() {
        System.out.println("【Student】 无参构造方法启动");
    }

    public void init() {
        System.out.println("【Student】 init()方法启动");
    }

    public void destroy() {
        System.out.println("【Student】 destroy()方法启动");
    }

}
