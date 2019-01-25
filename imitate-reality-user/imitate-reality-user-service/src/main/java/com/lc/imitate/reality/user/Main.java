package com.lc.imitate.reality.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("启动dubbo服务...");
        new ClassPathXmlApplicationContext("classpath:spring/application-context.xml");
        System.out.println("启动dubbo服务成功!");
        TimeUnit.SECONDS.sleep(1000L);
    }
}
