package com.example.springdatatest.teaching.springStaticField;

import com.example.springdatatest.teaching.modelMemory.A;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StaticField {

    private static A a;

    @Autowired
    public void setA(A a) {
        StaticField.a = a;
    }
}
