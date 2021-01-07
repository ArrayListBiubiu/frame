package code01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 《自定义类MyProcessor实现了InstantiationAwareBeanPostProcessor接口之后，该bean对象的生命周期，以及cglib动态代理的调用过程》
 *
 * 引入spring容器的有，（1）Dog，（2）MyProcessor，
 * 而MyInterceptor是用来做cglib动态代理时的拦截器，不需要交给spring管理
 *
 * 在resolveBeforeInstantiation()方法中有一个if判断，其中有一个重要参数hasInstantiationAwareBeanPostProcessors()，
 * 默认情况是false，只有实现了InstantiationAwareBeanPostProcessor接口的时候才会变成true，
 *      if (!mbd.isSynthetic() && hasInstantiationAwareBeanPostProcessors()) {
 *          ......
 *      }
 *
 * 在refresh()方法中，registerBeanPostProcessors()和finishBeanFactoryInitialization()都会创建bean对象，
 *
 * registerBeanPostProcessors()，只会创建实现了InstantiationAwareBeanPostProcessor接口的类，（MyProcessor会被提前创建）
 *      会遍历实现了InstantiationAwareBeanPostProcessor接口的bean，即MyProcessor，
 *      第一次进入if判断时候，由于什么都没有创建，参数hasInstantiationAwareBeanPostProcessors()一定是false，
 *      所以会退出if判断，需要调用createBean()方法正常创建一个MyProcessor对象，
 *
 * finishBeanFactoryInitialization()，只会创建剩下的单例bean对象，
 *      会遍历所有的bean对象，即Dog、MyProcessor，
 *      遍历Dog：这一次进入if判断的时候，由于上次已经创建过MyProcessor对象，参数hasInstantiationAwareBeanPostProcessors()会变成true，
 *              进入if判断，获取一个cglib动态代理的bean对象，直接返回，不需要调用createBean()方法来创建对象，
 *      遍历MyProcessor：因为这个bean对象之前已经创建过了，所以可以直接从一级缓存中获取，直接返回了，不会再进入后续的逻辑判断。
 *
 * 引申问题：
 * 1、在重写before和after的时候，只重写after可以嘛？？？
 *      bean = applyBeanPostProcessorsBeforeInstantiation(targetType, beanName);
 *      if (bean != null) {
 *          bean = applyBeanPostProcessorsAfterInitialization(bean, beanName);
 *      }
 *      不可以，因为如果不重写before就获取不到bean对象，那么就无法进入下边的if判断了，即便重写了after也毫无意义
 * 2、在MyProcessor中不实用cglib动态代理来创建对象，只是单纯的new一个可以嘛？那么也会被spring管理吗？
 *      可以，只不过无法得到方法的增强了，
 *      而且，不影响被spring管理。
 */
public class Main01 {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("code01.xml");
        Dog dog = ac.getBean(Dog.class);

        // 在调用doSomeThing()的时候，会被cglib动态代理的拦截器拦截，得到方法增强
        dog.doSomeThing();
    }
}
