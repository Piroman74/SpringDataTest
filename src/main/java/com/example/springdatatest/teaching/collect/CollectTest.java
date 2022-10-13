package com.example.springdatatest.teaching.collect;

import java.util.HashSet;
import java.util.Set;

public class CollectTest  {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hi");
        for (String s: stringSet) {
            if(s.contains("Hi")) {
                System.out.println("Yes");
            }
        }

    }
}
