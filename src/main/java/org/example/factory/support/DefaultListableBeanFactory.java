package org.example.factory.support;

import org.example.BeansException;
import org.example.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    /**
     * bean的注册，将具体的bean注入容器（map）
     * @param beanName
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    /**
     * 从容器中获取具体的bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("not bean name" + beanName);
        }
        return beanDefinition;
    }
}
