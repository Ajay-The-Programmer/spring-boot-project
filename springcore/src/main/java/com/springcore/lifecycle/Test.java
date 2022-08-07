package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext= new ClassPathXmlApplicationContext("lifeconfig.xml");
        Samosa s1=(Samosa) applicationContext.getBean("s1");
        System.out.println(s1);
        applicationContext.registerShutdownHook();
    }
}
