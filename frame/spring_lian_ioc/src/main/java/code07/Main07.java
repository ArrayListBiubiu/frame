package code07;


import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 【设置为不允许循环依赖】
 *
 * 1.为什么 beanFactory 的 allowCircularReferences 属性默认值是 true？
 *      因为 beanFactory 是 DefaultListableBeanFactory 类型，是 AbstractAutowireCapableBeanFactory 的子类，
 *      而 allowCircularReferences 在 AbstractAutowireCapableBeanFactory 类中有初始值就是 true。
 *
 * 2.如何修改为 false？
 *      protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
 * 		    ...略
 * 		    if (this.allowCircularReferences != null) {
 * 			    beanFactory.setAllowCircularReferences(this.allowCircularReferences);
 *          }
 *      }
 *      从上述代码中可以看到，可以将 ac 的 allowCircularReferences 赋值给 beanFactory，所以可以在调用 refresh() 之前提前给 ac 赋值，从而修改默认值，但是需要 ac 有值。
 */
public class Main07 {
    public static void main(String[] args) {
        // 1.无参构造，只是为了创建 ac 对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        // 2.修改初始值为 false，默认值是 null
        ac.setAllowCircularReferences(false);
        // 3.声明加载哪个配置文件
        ac.setConfigLocation("code07.xml");
        // 4.调用 refresh()
        ac.refresh();
    }
}
