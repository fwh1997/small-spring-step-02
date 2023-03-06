package org.example;

/**
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public class BeansException extends Throwable {
    public BeansException(String beanFail, ReflectiveOperationException e) {
        throw new RuntimeException(beanFail, e);
    }

    public BeansException(String beanFail) {
        throw new RuntimeException(beanFail);
    }
}
