package com.example.springdatatest.teaching.modelMemory;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {
    private  B b;

    public A(B b) {
        this.b = b;
    }
}

@Component
class B {
    private A a;

    public void setA(A a) {
        this.a = a;
    }
}
//
//class Test {
//    public static void main(String[] args) {
//        B b = new B();
//        A a = new A(b);
//    }
//}