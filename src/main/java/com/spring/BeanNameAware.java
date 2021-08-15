package com.spring;

/**
 * @author kuli.wzq
 * @since 2021-08-15 上午11:30
 */
public interface BeanNameAware {

    /**
     * 设置bean名称
     * @param name
     */
    void setBeanName(String name);
}
