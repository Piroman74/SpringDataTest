package com.example.springdatatest.teaching.lyambdsAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
                .filter(x->x>0)
                .count();
        System.out.println(count);
        // Stream не изменяет первоначальную коллекцию
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 5, 12, 53,11, 12));
        List<Integer> collect = arrayList.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(arrayList);
        System.out.println(collect);

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");

        Stream<String> citiesStream = cities.stream(); // получаем поток
        citiesStream = citiesStream.filter(s->s.length()==6); // применяем фильтрацию по длине строки
        citiesStream.forEach(s->System.out.println(s)); // выводим отфильтрованные строки на консоль
        //////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1, 5, 12, 53,11, 12));
        String collect1 = arrayList3.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(",", "It's prefix ", " Suffix"));
        System.out.println(".joining: " + collect1);
        //////////////////////////////////////////////////////////////////////////////////////////////


        // Создание стрима из массива
        Stream<String> stream = Arrays.stream(new String[]{"Moskov", "London", "Mexico"});
        stream.forEach(System.out::println);

        String[] s = {"Da","Net","Ok"};
        Arrays.stream(s).forEach(System.out::println);

        // From Stream.of
        Stream<String> stringStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        stringStream.forEach(System.out::println);

        IntSummaryStatistics count2 = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
                .summaryStatistics();
        System.out.println(count2);

        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 5, 12, 53,11, 12));
        Optional<Integer> max = arrayList2.stream()
                .max(Integer::compareTo);
        max.ifPresent(System.out::println);
        max.filter(x->x>55)
                        .ifPresent(System.out::println);

        Map<String, Integer> string1 = Map.of(
                "string1", 1,
                "string2", 2,
                "string3", 3,
                "string4", 4
        );
        string1.entrySet().forEach(sr-> System.out.println(sr.getKey()));


    }
}
