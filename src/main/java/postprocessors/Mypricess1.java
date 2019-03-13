package postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @description:
 * @author: LiYongSen[825760990@qq.com]
 * @create: 2019-03-13 10:32
 **/
public class Mypricess1 implements BeanDefinitionRegistryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("Mypricess1");
        System.out.println(beanFactory);
    }

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("Mypricess1");
        System.out.println(registry);
    }
}
