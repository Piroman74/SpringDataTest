package com.example.springdatatest.teaching.expetionTest;

public class ExceptionTest {
    public void abc() throws Exception {
        try {
            System.out.println(1);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
