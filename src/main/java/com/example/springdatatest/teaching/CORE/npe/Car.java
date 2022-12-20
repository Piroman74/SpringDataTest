package com.example.springdatatest.teaching.CORE.npe;

import lombok.Data;

import java.nio.charset.StandardCharsets;

@Data
public class Car {
    private String model;
    private String model2;
}

class Test {
    public static void main(String[] args) {
        Car car = new Car();
        // It's ok
        car.setModel2(car.getModel());
        //////////////////////////////
        // NPE!!!!
        car.getModel().length();
        //////////////////////////////
        // NPE!!!!
        car.getModel().getBytes(StandardCharsets.UTF_8);
    }
}
