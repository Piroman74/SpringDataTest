package com.example.springdatatest.teaching.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CollTest {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Hi","Grace","Vabadabalaba","Hi"));
        Optional<String> min = arrayList.stream().min(Comparator.comparing(String::length));

        System.out.println(min.get()); // минимальное по кол.символов
        System.out.println(Collections.min(arrayList)); // минимальное по алфавиту

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println("Collections.shuffle: " + arrayList);

        Collections.swap(arrayList,0,2);
        System.out.println("Collections.swap: " + arrayList);

//        Collections.fill(arrayList, "Hello");
//        System.out.println("Collections.fill: " + arrayList);

        Collections.replaceAll(arrayList, "Hi", "Privet");
        System.out.println("Collections.fill: " + arrayList);

        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        System.out.println(unmodifiableList);

    }
}
