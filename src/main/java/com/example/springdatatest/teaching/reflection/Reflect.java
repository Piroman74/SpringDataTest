package com.example.springdatatest.teaching.reflection;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
public class Reflect {
    private int age;

    private void forTest() {
    }

    public static int testMethod(int i) {
        return i;
    }

}

class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Reflect reflect = new Reflect(22);
        Class<? extends Reflect> aClass = reflect.getClass();
        Class<Reflect> reflectClass = Reflect.class;
        System.out.println(aClass == reflectClass);
        System.out.println(aClass.getConstructors());
        aClass.getConstructors()[0].getModifiers();

        Method testMethod = aClass.getDeclaredMethod("testMethod", int.class);
        System.out.println(testMethod.invoke(aClass, 100));

        int i = holyShit()[1];
        System.out.println(i);
    }

    public static int[] holyShit() {
        return new int[]{2, 5, 1};
    }
}