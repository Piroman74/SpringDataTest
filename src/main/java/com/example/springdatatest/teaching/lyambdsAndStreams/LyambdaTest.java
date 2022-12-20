package com.example.springdatatest.teaching.lyambdsAndStreams;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LyambdaTest {

    public void lyambda1() {
        // Ниже наша функция которой мы можем пользоваться множество раз.
        // Мы определили ссылку на функ интерфейс и создали лямбда - выражение
        FunctionalInter1 f1 = (x, y) -> x + y;
        FunctionalInter1 f2 = (x, y) -> x - y;
        //////////////////////////////////////

        int result = f1.calculate(10, 20);
        System.out.println(result);
    }

    public void predicateTest(Integer a) {
        Predicate<Integer> predicate = x -> x > 5;
        predicate.test(a);
    }


    public void biConsumerTest(int a, int b) {
        BiConsumer<Integer, Integer> b1 = (x, y) -> {
            System.out.println(x + y);
        };
        b1.accept(a, b);
    }

    public Integer supplierTest() {
        Supplier<Integer> s1 = () -> 5;
        return s1.get();
    }

    public Integer binaryOperatorTest() {
        BinaryOperator<Integer> b1 = (x, y) -> x * y;
        return b1.apply(2, 55);
    }
    public void consumerTest() {
        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов
    }
}

@FunctionalInterface
interface FunctionalInter1 {
    int calculate(int x, int y);
}

////////////////////////////////////////////////////////////////////////
class LambdaApp {

    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {

        Operation op = () -> {
            x = 30;
            return x + y;
        };

        System.out.println(op.calculate()); // 50
        System.out.println(x); // 30 - значение x изменилось
    }

    public void test1() {
        int n = 70;
        int m = 30;
        Operation op = () -> {

//            n=100; - так нельзя сделать
            return m + n;
        };
        // n=100;  - так тоже нельзя
        System.out.println(op.calculate()); // 100
    }
}

@FunctionalInterface
interface Operation {
    int calculate();
}
//////////////////////////////////////////////////////////////////

class LambdaApp2 {

    public static void main(String[] args) {

        Expression func = n -> n % 2 == 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(nums, func)); // 20
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}

@FunctionalInterface
interface Expression {
    boolean isEqual(int n);
}
///////////////////////////////////////////////////////////////////////////

// класс, в котором определены методы
class ExpressionHelper {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}

class LambdaApp3 {

    public static void main(String[] args) {

        int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(nums, ExpressionHelper::isEven));

        Expression2 expr = ExpressionHelper::isPositive;
        System.out.println(sum(nums, expr));
    }

    private static int sum(int[] numbers, Expression2 func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}

@FunctionalInterface
interface Expression2 {
    boolean isEqual(int n);
}

///////////////////////////////////////////////////////////
@FunctionalInterface
interface Operation2 {
    int execute(int x, int y);
}

class LambdaApp4 {

    public static void main(String[] args) {

        Operation2 func = action(1);
        int a = func.execute(6, 5);
        System.out.println(a);          // 11

        int b = action(2).execute(8, 2);
        System.out.println(b);          // 6
    }

    private static Operation2 action(int number) {
        switch (number) {
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x - y;
            case 3:
                return (x, y) -> x * y;
            default:
                return (x, y) -> 0;
        }
    }
}


