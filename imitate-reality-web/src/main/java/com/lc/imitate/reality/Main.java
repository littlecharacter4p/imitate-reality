package com.lc.imitate.reality;

import com.alibaba.fastjson.JSON;
import com.lc.imitate.reality.contract.UserContract;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/application-context.xml");
        UserContract userContract = (UserContract) applicationContext.getBean("userContract");
        System.out.println(JSON.toJSONString(userContract.getUserById(20190122100433L)));
    }
}
