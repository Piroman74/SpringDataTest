package com.example.springdatatest.teaching.modelMemory;

public class ObjectStringTest {
    public static void main(String[] args) {
        Object a = "5".intern();
        Object b = "5".intern();
        System.out.println(a.getClass());
        System.out.println(a.equals(b));
    }
}
