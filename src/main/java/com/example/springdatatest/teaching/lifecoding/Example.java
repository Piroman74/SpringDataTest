package com.example.springdatatest.teaching.lifecoding;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i;
        }
        System.out.println(Arrays.toString(massiv));
    }
}
