package com.example.springdatatest.teaching.multitheading;

public class ThreadRunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread2 = new Thread(new ThreadRun1());
        thread2.start();
        thread2.join();
        System.out.println("Main thread " + Thread.currentThread().getName());
    }
}

class ThreadRun1 implements Runnable {

    @Override
    public void run() {
        System.out.println("It's threadRunnable " + Thread.currentThread().getName());
    }
}
