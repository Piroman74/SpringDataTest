package com.example.springdatatest.teaching.modelMemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {
    private B b;

    public A(@Lazy B b) {
        this.b = b;
        System.out.println("From A");
    }
}


//
//class Test {
//    public static void main(String[] args) {
//        B b = new B();
//        A a = new A(b);
//    }
//}