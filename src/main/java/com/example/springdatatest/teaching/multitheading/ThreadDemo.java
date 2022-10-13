package com.example.springdatatest.teaching.multitheading;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
        simpleThread.join(); // simpleThread будет выполняться, остальные подождут
        System.out.println("Main Thread");
    }
}
