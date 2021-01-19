package ioc.code05;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 定制beanFactory的自定义修改：
 *      可以通过重写customizeBeanFactory(DefaultListableBeanFactory beanFactory)方法，完成自定义的过程
 *
 * （1）创建MyClassPathApplicationContext类，继承ClassPathApplicationContext
 * （2）重写构造方法（这里如果不写的话，就会默认调用父类的无参构造，但是父类的无参构造是一个空方法）
 * （3）重写customizeBeanFactory(DefaultListableBeanFactory beanFactory)方法，完成自定义的过程。
 *          因为在创建属性时已经赋予了默认值true：
 *          【（子）DefaultListableBeanFactory】         private boolean allowBeanDefinitionOverriding = true;
 *          【（父）AbstractAutowireCapableBeanFactory】 private boolean allowCircularReferences = true;
 *
 *          在重写的方法中，修改默认值：
 *          setAllowBeanDefinitionOverriding(false);
 *          setAllowCircularReferences(false);
 * （4）当然启动的时候要以 MyClassPathXmlApplicationContext 的构造方法启动。
 *
 * 注：
 *      这里很容易搞混，明明 DefaultListableBeanFactory 和 ClassPathXmlApplicationContext 也没有任何继承关系啊，怎么还互相赋值呢？
 *      对没有错，仔细看才发现，传递的不是对象而是属性值，即传递的是“true”这个boolean值而已，
 *          源码内容：
 *          protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
 *              if (this.allowBeanDefinitionOverriding != null) {
 *                  beanFactory.setAllowBeanDefinitionOverriding(this.allowBeanDefinitionOverriding);
 *              }
 *              if (this.allowCircularReferences != null) {
 *                  beanFactory.setAllowCircularReferences(this.allowCircularReferences);
 *              }
 *          }
 *      而这个this指代的是 ClassPathXmlApplicationContext 对象，最初肯定是null，所以这里的2个if判断都是进不去的，
 *      进不去，DefaultListableBeanFactory 的属性值就维持默认的true了。
 *
 *
 */
public class Main05 {
    public static void main(String[] args) {
        // 这个配置文件参数无意义，这个demo中不需要创建任何bean对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("code05.xml");
    }
}