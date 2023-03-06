package org.example.factory;

import org.example.BeansException;
import org.example.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

}
