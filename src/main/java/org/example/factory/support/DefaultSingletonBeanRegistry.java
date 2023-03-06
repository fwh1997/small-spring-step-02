package org.example.factory.support;

import org.example.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 核心的实现类，单例模式获取bean对象，都从这里获取/注入
 * 这个类只处理单例模式获取具体的bean对象
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 实现一个add方法，可以被继承类调用
     * @param beanName bean名称
     * @param singletonObject bean对象
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
