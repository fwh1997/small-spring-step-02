package org.example.factory.support;

import org.example.BeansException;
import org.example.factory.BeanFactory;
import org.example.factory.config.BeanDefinition;

/**
 * 获取bean
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException{
        Object bean = getSingleton(beanName);
        if (bean!=null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }



    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
