package com.springcore.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int personalId;
    @Autowired
    private Certi certi;


    public Person(String name, int personalId, Certi certi) {
        this.name = name;
        this.personalId = personalId;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personalId=" + personalId +
                ", certi=" + this.certi.name + '}';
    }
}
