package com.example.springdatatest.teaching.lyambdsAndStreams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        List<TestObj> list = new ArrayList();
        List<TestObj> nullList = null;

//        list.add(new TestObj(null, 5));
        list.add(new TestObj("Slava", 1));
        list.add(null);

        Optional<TestObj> slava = method3(nullList, "Slava");
        System.out.println(slava.get());

    }





    static Optional<TestObj> method(List<TestObj> list, String name) {
        if (list != null) {
//        if (Optional.ofNullable(list).isPresent()) {
            Optional<TestObj> opt = list.stream()
                    .filter(x -> Optional.ofNullable(x.getListName()).isPresent())
                    .filter(x -> x.getListName().equals(name))
                    .findFirst();
            return opt;
        }
        return Optional.empty();
    }

    public static Optional<TestObj> method2(List<TestObj> list, String name) {
        return Optional.of(Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(i -> i.getListName().equals(name))
                .findAny()
                .orElseThrow());

    }

    // Optional.ofNullable(); - если передали null объект то вернет пустой Optional :: Так решаем если передали объект ссылающийся на Null
    //

    public static Optional<TestObj> method3(List<TestObj> list, String name) {
        TestObj simple = new TestObj();
        Optional<TestObj> test = Optional.ofNullable(simple);

        return test;

    }
}

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//class A {
//    private String listName;
//    private int age;
//}

