package com.example.springdatatest.teaching.multitheading.interrupted;

public class InterruptedTest implements Runnable{
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("No");

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new InterruptedTest());
        thread1.start();
        Thread.sleep(3000);
        thread1.interrupt();
        thread1.join();
        System.out.println("Over");
    }
}
