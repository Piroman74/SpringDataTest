package com.example.springdatatest.teaching.lyambdsAndStreams;

import com.example.springdatatest.models.Users;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduceTest {
    public static void main(String[] args) {
        Stream.of(new Student(1, "Kolya", 21),
                        new Student(2, "Sveta", 41),
                        new Student(3, "Masha", 22),
                        new Student(4, "Vasya", 24),
                        new Student(5, "Gena", 25)
                )
                .filter(x -> x.getAge() > 22 && x.getName().length()>3)
                .map(x -> x.getName() + " " + x.getAge())
                .forEach(System.out::println);

        Stream.of(new Student(1, "Kolya", 21),
                        new Student(2, "Sveta", 41),
                        new Student(3, "Masha", 22),
                        new Student(4, "Vasya", 24),
                        new Student(5, "Gena", 25)
                )
                .filter(x -> x.getAge() > 22 && x.getName().length()>3)
                .map(x -> x.getName() + " " + x.getAge())
                .forEach(System.out::println);

    }
}

@Data
@AllArgsConstructor
class Student {
    long id;
    String name;
    int age;
}