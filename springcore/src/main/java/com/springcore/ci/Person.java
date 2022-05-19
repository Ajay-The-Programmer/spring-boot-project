package com.springcore.ci;

public class Person {
    private String name;
    private int personalId;
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
