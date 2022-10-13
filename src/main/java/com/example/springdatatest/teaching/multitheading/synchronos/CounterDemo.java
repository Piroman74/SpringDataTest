package com.example.springdatatest.teaching.multitheading.synchronos;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread counterThread1 = new Thread(new CounterThread(counter));
        Thread counterThread2 = new Thread(new CounterThread(counter));
        Thread counterThread3 = new Thread(new CounterThread(counter));
        Thread counterThread4 = new Thread(new CounterThread(counter));
        Thread counterThread5 = new Thread(new CounterThread(counter));
        Thread counterThread6 = new Thread(new CounterThread(counter));
        Thread counterThread7 = new Thread(new CounterThread(counter));
        Thread counterThread8 = new Thread(new CounterThread(counter));

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();
        counterThread5.start();
        counterThread6.start();
        counterThread7.start();
        counterThread8.start();

        try {
            counterThread1.join();
            counterThread2.join();
            counterThread3.join();
            counterThread4.join();
            counterThread5.join();
            counterThread6.join();
            counterThread7.join();
            counterThread8.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCounter());


    }
}
