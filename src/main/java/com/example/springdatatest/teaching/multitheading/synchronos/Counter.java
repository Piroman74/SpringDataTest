package com.example.springdatatest.teaching.multitheading.synchronos;

public class Counter {
    private int counter;

    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    public synchronized void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}
