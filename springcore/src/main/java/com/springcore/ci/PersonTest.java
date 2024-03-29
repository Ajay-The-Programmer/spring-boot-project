package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configci.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);

        Addition addition = (Addition) context.getBean("add");
        addition.doSum();
    }
}
