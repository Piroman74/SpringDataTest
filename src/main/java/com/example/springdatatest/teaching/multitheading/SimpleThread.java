package com.example.springdatatest.teaching.multitheading;
// в потоках своя стековая память
public class SimpleThread extends Thread{
    @Override
    public void run() {
        System.out.println("It's Thread #1");
    }
}
