package com.springcore.ci;

import org.springframework.stereotype.Component;

@Component
public class Certi {
     String name;

    public Certi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
