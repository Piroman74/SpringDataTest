package com.example.springdatatest.teaching.lyambdsAndStreams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List citylist = Arrays.asList("delhi", "mumbai", "hyderabad", "ahmedabad", "indore", "patna")
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        ///////////////////////////////////////

        List<String> list1 = Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius");
        List<String> list2 = Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland");

        List<String> country = Stream.of(list1, list2)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(country);

///////////////////////////////////////////////////////////////////
        List<Book> listBook1 = Arrays.asList(new Book("Daughter of Captain"));
        List<Book> listBook2 = Arrays.asList(new Book("Mciri"), new Book("Harmony"));

        Person person1 = new Person("Pushkin", 34, listBook1);
        Person person2 = new Person("Lermontov", 43, listBook2);

        List<Person> listOfPerson = List.of(person1, person2);

        Optional<String> first = listOfPerson
                .stream()
                .map(book -> book.getBook())
                .flatMap(list -> list.stream())
                .map(book -> book.getNameOfBook())
                .filter(nameOfBook -> nameOfBook.length() > 5)
                .findFirst();
        System.out.println(first.get());

        List<String> collect = listOfPerson.stream()
                .map(book -> book.getBook())
                .filter(list -> list.size() > 1)
                .flatMap(list -> list.stream())
                .map(e -> e.getNameOfBook())
                .collect(Collectors.toList());
        System.out.println(collect);
///////////////////////////////////////////////////////////////////
        // Стрим одноразовый
        Stream<String> stringStream = listOfPerson.stream()
                .map(book -> book.getBook())
                .filter(list -> list.size() > 1)
                .flatMap(list -> list.stream())
                .map(e -> e.getNameOfBook());

        List<String> collect1 = stringStream.collect(Collectors.toList());
        List<String> collect3 = stringStream.collect(Collectors.toList());
///////////////////////////////////////////////////////////////////

        List<String> collect2 = listOfPerson.stream()
                .map(name -> name.getName())
                .collect(Collectors.toList());
        System.out.println(collect2);

    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private int age;
    private List<Book> book;
}

@Data
@AllArgsConstructor
class Book {
    private String nameOfBook;
}

@AllArgsConstructor
class User {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User vasya = (User) o;

        return name != null ? name.equals(vasya.name) : vasya.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

class Testik {
    public static void main(String[] args) {
        User user = new User("Vasya");
        HashMap<User, String> map = new HashMap<>();
        map.put(user,"Hello Vasya!");

        User user2 = new User("Vasya");

        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(map.containsKey(user2));

    }
}