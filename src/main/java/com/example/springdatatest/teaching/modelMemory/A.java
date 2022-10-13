package com.example.springdatatest.teaching.modelMemory;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class A {
    private final B b;

    public A(B b) {
        this.b = b;
    }
}

@Component
@Lazy
class B {
    private final A a;

    public B(A a) {
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