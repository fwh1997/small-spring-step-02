package org.example.factory.config;

/**
 * 单例注册接口
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public interface SingletonBeanRegistry {
    /**
     * 定义一个获取单例对象的接口
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
