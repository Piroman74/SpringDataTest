package com.example.springdatatest.teaching.modelMemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }
}