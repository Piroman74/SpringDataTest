package com.example.springdatatest.teaching.CORE.typeData;

public class DataTypeTest {
    public static void main(String[] args) {
        int i = 232155;
        byte b = 5;
        long l = 21313131313L;
        long ll = (long) i;
        float f = 21.4F;
        double d = i;
        System.out.println(d);


    }
}

class Vehicle {
    public void kmToMiles(int km) {
        System.out.println("Внутри родительского класса/статического метода Vehicle");
    }

    private void speed(){}

    public void forTest(){
        System.out.println("Vehicle method");
    }
}

class Car extends Vehicle {
    public void kmToMiles(int km) {
        System.out.println("Внутри дочернего класса/статического метода Car");
    }

    @Override
    public void forTest() {
        System.out.println("Car method");
    }
}

class Bicycle extends Vehicle {
    public void kmToMiles(int km) {
        System.out.println("Внутри дочернего класса/статического метода Bicycle");
    }
}

class Test {
    public static void main(String[] args) {

        Car car = new Car();
        Vehicle v2 = new Bicycle();
        Vehicle v3 = new Car();
        Vehicle v4 = new Vehicle();

        v2 = car;
//        System.out.println(v2==car);
//        car.kmToMiles(1);
//        v2.kmToMiles(1);


        car.forTest();
        v2.forTest();
        v3.forTest();
        v4.forTest();

    }


}