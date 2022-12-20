package com.example.springdatatest.teaching.CORE.inheritance;

import lombok.Data;

@Data
public abstract class A {

    private int testInt;
    private EmbeddedClass embeddedClass;

    abstract void bca();

    private void abc() {
        System.out.println("Abstract Class A");
    }

    private void getAbc() {
        abc();
    }

}

class EmbeddedClass {
}

class B extends A {

    private void abc() {
        System.out.println("Class B method abc()");
    }

    @Override
    void bca() {
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getTestInt());
        System.out.println(b.getEmbeddedClass());
        // private поля наследуются
        b.bca();
    }
}

class Aaa {
    /**
     * ЭТО ОБЪЯВЛЕНИЕ И ИНИЗИАЛИЗАЦИЯ.,
     * НО ЕСЛИ ПРОСТО ОБЪЯВИТЬ как age ниже, то потом уже надо будет
     * ПРИСВОИТЬ!!! значение
     */
    private int id = 1;
    private int age;


    public Aaa(int age) {
        this.age = age;
    }

    public void forPereopredelenie() {
        System.out.println("From Aaa");
    }

    /**
     * НЕЛЬЗЯ ПЕРЕОПРЕДЕЛИТЬ final метод
     */
    public final void cannotBeOverridden(){
    }

    public int getAge() {
        return age;
    }
}

class Bbb extends Aaa {
    private String name;

    private String lastName;

    public Bbb(int age, String name) {
        super(age);
        this.name = name;
    }

//    @Override
//    public void forPereopredelenie() {
//        System.out.println("From Bbb");
//    }

    public void getterTest() {
        System.out.println("Class B - getter " + getAge());
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}

class TestC {
    public static void main(String[] args) {
        Bbb b = new Bbb(5,"Hola");
        System.out.println(b.getName());
        b.getterTest();
        b.cannotBeOverridden();
        /**
         * ЕСЛИ ПОЛЕ ТО БУДЕТ ЗНАЧЕНИЕ ПО УМОЛЧАНИЮ
         */
        System.out.println(b.getLastName());




        /**
         * Так как Employee наследуется от Person, то объект Employee является в то же время и объектом Person.
         * Грубо говоря, любой работник предприятия одновременно является человеком.
         *
         * Однако несмотря на то, что переменная представляет объект Person, виртуальная машина видит,
         * что в реальности она указывает на объект Employee. Поэтому при вызове методов у этого объекта будет
         * вызываться та версия метода, которая определена в классе Employee, а не в Person. METANIT
         */
        Aaa surprise = new Bbb(1,"Sava");
        surprise.forPereopredelenie();

    }
}