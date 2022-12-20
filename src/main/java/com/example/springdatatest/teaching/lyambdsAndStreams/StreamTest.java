package com.example.springdatatest.teaching.lyambdsAndStreams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.TypedQuery;
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
                .filter(x -> x > 0)
                .count();
        System.out.println(count);
        // Stream не изменяет первоначальную коллекцию
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 5, 12, 53, 11, 12));
        List<Integer> collect = arrayList.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(arrayList);
        System.out.println(collect);

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");

        Stream<String> citiesStream = cities.stream(); // получаем поток
        citiesStream = citiesStream.filter(s -> s.length() == 6); // применяем фильтрацию по длине строки
        citiesStream.forEach(s -> System.out.println(s)); // выводим отфильтрованные строки на консоль
        //////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1, 5, 12, 53, 11, 12));
        String collect1 = arrayList3.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(",", "It's prefix ", " Suffix"));
        System.out.println(".joining: " + collect1);
        //////////////////////////////////////////////////////////////////////////////////////////////


        // Создание стрима из массива
        Stream<String> stream = Arrays.stream(new String[]{"Moskov", "London", "Mexico"});
        stream.forEach(System.out::println);

        String[] s = {"Da", "Net", "Ok"};
        Arrays.stream(s).forEach(System.out::println);

        // From Stream.of
        Stream<String> stringStream = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
        stringStream.forEach(System.out::println);

        IntSummaryStatistics count2 = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
                .summaryStatistics();
        System.out.println(count2);

        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 5, 12, 53, 11, 12));
        Optional<Integer> max = arrayList2.stream()
                .max(Integer::compareTo);
        max.ifPresent(System.out::println);
        max.filter(x -> x > 55)
                .ifPresent(System.out::println);

        Map<String, Integer> string1 = Map.of(
                "string1", 1,
                "string2", 2,
                "string3", 3,
                "string4", 4
        );
        string1.entrySet().forEach(sr -> System.out.println(sr.getKey()));

        Optional<Integer> reduce = arrayList2.stream()
                .reduce((accum, value) -> accum + value);

        System.out.println("///////////////////////////////////////////////");
        Stream<Integer> integerStream = arrayList2.stream().map(x -> x + 500);
        List<Integer> collect2 = integerStream.collect(Collectors.toList());
        Stream<Integer> integerStream1 = collect2.stream().map(x -> x - 500);
        List<Integer> collect3 = integerStream1.collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println(collect3);
        System.out.println("///////////////////////////////////////////////");


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

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class TestObj {
    private String listName;
    private int age;
}

class SingleResultUtil {
    public static <T> Optional<T> getSingleResultOrNull(TypedQuery<T> var) {
        try {
            return Optional.of(var.getSingleResult());
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
