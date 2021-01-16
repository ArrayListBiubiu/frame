package code09;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * InstantiationAwareBeanPostProcessor 接口 postProcessAfterInstantiation() 方法
 *
 * 实现过程：
 *      （1）创建实现类对象
 *      （2）告诉beanFactory有这个实现类
 *      （3）调用
 *      或
 *      （1）自定义类实现InstantiationAwareBeanPostProcessor接口，并注册到容器中
 *      （2）重写postProcessAfterInstantiation()方法（实际上调用的位置，就是第五次调用后置处理器位置）
 *      （3）返回true，继续populateBean()后续的执行过程；返回false，直接populateBean()终止后续的执行过程；（这里需要查看populateBean()方法的源码，就很好理解了）
 *
 * 注：
 *      这个案例中我特意做了2个bean对象，只是为了说明，
 *      bpp的增加不是针对哪一个具体的bean对象，而是针对的是当前的整个spring容器，具体是为哪一个bean对象服务，还要具体看重写的方法逻辑。
 */
public class Main09 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("code09.xml");
    }
}
