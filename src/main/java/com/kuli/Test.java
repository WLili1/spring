package com.kuli;

import com.kuli.service.UserService;
import com.spring.KuliApplicationContext;

/**
 * @author wzq
 */
public class Test {
    public static void main(String[] args) {
        KuliApplicationContext applicationContext = new KuliApplicationContext(AppConfig.class);

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.test();
    }
}
