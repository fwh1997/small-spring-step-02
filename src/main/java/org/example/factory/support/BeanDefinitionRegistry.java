package org.example.factory.support;

import org.example.factory.config.BeanDefinition;

/**
 * bean的注册接口
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
