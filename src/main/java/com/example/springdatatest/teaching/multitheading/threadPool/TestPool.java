package com.example.springdatatest.teaching.multitheading.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Thread1());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sss");
        sb.append("222");
        System.out.println(sb);

    }
}
class Thread1 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class A extends B{

}
abstract class B {
    void abc() {

    }
}
interface C {
    abstract void cda();
}