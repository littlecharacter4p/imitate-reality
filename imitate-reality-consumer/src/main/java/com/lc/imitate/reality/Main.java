package com.lc.imitate.reality;

import com.lc.imitate.reality.contract.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService.getUserById(20190122100433L));
    }
}
