package org.example.factory.support;

import org.example.BeansException;
import org.example.factory.config.BeanDefinition;

/**
 * 实例化bean
 * 类似spring的autowired，将bean注入容器（map）
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        }catch (InstantiationException| IllegalAccessException e) {
            throw new BeansException("bean fail", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
