package com.spring;

/**
 * @author kuli.wzq
 * @since 2021-08-15 上午11:41
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName);

    Object postProcessAfterInitialization(Object bean, String beanName);
}
