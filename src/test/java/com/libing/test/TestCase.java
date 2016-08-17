/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test;

import org.junit.Test;

import com.libing.test.dao.User;
import com.libing.test.dao.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月17日下午11:03:47
 */
public class TestCase {

//    @Ignore
    @Test
    public void testSpring() {

        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        UserService userService = ac.getBean("userService", UserService.class);
        User user = userService.login("libing", "123456");
        System.out.println(user);

        AbstractApplicationContext acc = (AbstractApplicationContext) ac;
        acc.close();

    }

}
