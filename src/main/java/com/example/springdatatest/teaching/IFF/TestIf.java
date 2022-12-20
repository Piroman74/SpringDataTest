package com.example.springdatatest.teaching.IFF;

public class TestIf {
    private static int k;
    public void exampleIf(Object obj) {
        if (obj instanceof String) {
            System.out.println("Its String!");
        } else if (obj instanceof Number) {
            System.out.println("Its Number!");
        } else if (obj instanceof String) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TestIf t = new TestIf();
        t.exampleIf("Hi");
        Number number = new Integer(5);
    }
}
