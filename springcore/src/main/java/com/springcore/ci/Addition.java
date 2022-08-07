package com.springcore.ci;

import org.springframework.stereotype.Controller;

@Controller
public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        System.out.println("contructor:int,int");
        this.a = a;
        this.b = b;
    }

    public Addition(double a, double b) {
        System.out.println("contructor:double,double");
        this.a = (int) a;
        this.b = (int) b;
    }

    public Addition(String a, String b) {
        System.out.println("contructor:string,string");
        this.a = Integer.parseInt(a) ;
        this.b = Integer.parseInt(b) ;

    }

    public void doSum() {
        System.out.println("sum is " + (this.a + this.b));
        System.out.println("sum is " + (this.a + this.b));
    }

}
