package 创建对象;

import org.springframework.stereotype.Component;

/**
 * spring创建对象的方式：（四）基于注解
 *                 1.如果没有显示的指定bean-id，默认使用类名且首字母小写  =>  getBean("dog04")。
 *                 2.也可以通过注解指定bean-id，Component("dog0444")  =>  getBean("dog0444")。
 *                 ***这里还是再次强调说烂了的一句话：
 *                 当扫描spring的配置文件的时候已经创建完对象了并存储在缓存map中，getBean()方法只是从容器中把对象拿出来而已。
 *
 */
@Component
public class Dog04 {

    public Dog04() {
        System.out.println("Dog04无参数构造方法启动。。。");
    }

}
