//package com.example.springdatatest.teaching.collection;
//
//import lombok.AllArgsConstructor;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
//public class CollTest {
//    public static void main(String[] args) {
//
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Hi", "Grace", "Vabadabalaba", "Hi"));
//        Optional<String> min = arrayList.stream().min(Comparator.comparing(String::length));
//
//        System.out.println(min.get()); // минимальное по кол.символов
//        System.out.println(Collections.min(arrayList)); // минимальное по алфавиту
//
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
//
//        Collections.shuffle(arrayList);
//        System.out.println("Collections.shuffle: " + arrayList);
//
//        Collections.swap(arrayList, 0, 2);
//        System.out.println("Collections.swap: " + arrayList);
//
////        Collections.fill(arrayList, "Hello");
////        System.out.println("Collections.fill: " + arrayList);
//
//        Collections.replaceAll(arrayList, "Hi", "Privet");
//        System.out.println("Collections.fill: " + arrayList);
//
//        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
//        System.out.println(unmodifiableList);
//
//        //Set
//        Set<String> set = new HashSet<>();
//        set.add("Hi");
//        System.out.println(set.contains("Hi"));
//
//
//    }
//}
//
//class ListTest {
//    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        Integer integer = integerList.get(3);
//        boolean contains = integerList.contains(5);
//        System.out.println(integer);
//        System.out.println(contains);
//
//        List<String> linkedList = new LinkedList<>(Arrays.asList("hi", "by"));
//        System.out.println(linkedList.get(1));
//
//        Set<String> hashSet = new HashSet<>();
//        hashSet.add("hh");
//        hashSet.add("qq");
//        hashSet.add("ww");
//        hashSet.add("xx");
//        hashSet.add("vv");
//        hashSet.add("bb");
//        hashSet.add("yy");
//        System.out.println(hashSet);
//
//        Set<Car> hashSet2 = new HashSet<>();
//        Car car1 = new Car("vaz");
//        hashSet.add(car1);
//    }
//}
//@AllArgsConstructor
//class Car {
//    String model;
//}