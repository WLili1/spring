package com.spring;

/**
 * @author kuli.wzq
 * @since 2021-08-15 上午11:35
 */
public interface InitializingBean {

    /**
     * 初始化方法
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
