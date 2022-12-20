package com.example.springdatatest.teaching.finalExtends;

public class ClassWithFinal {
    final int a = 5;

    final void abcFinal() {
        System.out.println("Parent");
    }
}

class ChildFinal extends ClassWithFinal {

}

class Test {
    public static void main(String[] args) {
        ClassWithFinal classWithFinal = new ClassWithFinal();
        ChildFinal childFinal = new ChildFinal();
        childFinal.abcFinal();
        int a = childFinal.a;
        System.out.println(a);
    }
}
