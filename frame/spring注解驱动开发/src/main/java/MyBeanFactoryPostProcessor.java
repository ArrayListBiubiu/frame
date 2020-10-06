import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("");
//        // ×¢²áÁíÍâÒ»¸ö Class
//        genericBeanDefinition.setBeanClass(AAA.class);
    }
}
