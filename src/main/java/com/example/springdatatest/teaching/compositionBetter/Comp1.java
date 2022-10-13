package com.example.springdatatest.teaching.compositionBetter;

public class Comp1 {

}

class Transport{
    // Это Агрегация
    private Driver drive;
    // Это Композиция
    private Engine engine;

    public Transport(Engine engine) {
        this.engine = engine;
    }

    public void setDrive(Driver drive) {
        this.drive = drive;
    }

    public static void main(String[] args) {
        Transport transport = new Transport(new CombustionEngine());
        transport.setDrive(new Human());
    }
}
interface Driver{
    void navigate();
}
class Robot implements Driver{
    @Override
    public void navigate() {

    }
}
class Human implements Driver{
    @Override
    public void navigate() {

    }
}


interface Engine{
    void move();
}

class CombustionEngine implements Engine {
    @Override
    public void move() {
    }
}
class ElectricEngine implements Engine {
    @Override
    public void move() {
    }
}