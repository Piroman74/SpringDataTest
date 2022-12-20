package com.example.springdatatest.teaching.jenerics;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Cat<T extends Number> {
    void meow(T t) {
        System.out.println(t.getClass());
    }
}

class Test {
    public static void main(String[] args) {
        Cat<Integer> cat = new Cat<>();

        cat.meow(2);

        Dog dog = new Dog();
        WeakReference<Dog> weakReference = new WeakReference<>(dog);
        SoftReference<Dog> softReferenceM = new SoftReference<>(dog);
        System.out.println(weakReference.equals(softReferenceM));

    }
}

class Dog {
}

@Component
class Robot1 {
    void doWork() {
    }
}

@Component
class Robot2 {
    void doWork() {
    }
}

@Service
class ForTest {
    public static void main(String[] args) {

    }
}


