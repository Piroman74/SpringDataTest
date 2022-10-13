package com.example.springdatatest.teaching.equalAndHashcode;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public final class Fox {
    private final String name;
    private final int weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fox fox = (Fox) o;

        if (weight != fox.weight) return false;
        return name != null ? name.equals(fox.name) : fox.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        Map<Fox, String> map = new HashMap<>();
        Fox f1 = new Fox("Gera", 15);
        Fox f2 = new Fox("Gera", 15);
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());

        System.out.println("------------------------------");
        System.out.println(".equals(): " + f1.equals(f2));
        System.out.println(f1 == f2);
        System.out.println("------------------------------");

        map.put(f1, "test1");
        String s = map.get(f2);
        System.out.println(s);
    }
}

interface A{
    void foo();

     default void A() {

    }
}
abstract class B implements A {
    @Override
    public void foo() {

    }

}
class C extends B {

}