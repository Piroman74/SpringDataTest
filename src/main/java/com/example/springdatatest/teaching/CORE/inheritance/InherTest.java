package com.example.springdatatest.teaching.CORE.inheritance;

public class InherTest {
    public static void main(String[] args) {
        Bass bass = new Bass();
    }
}

class Ass {
    protected int speed;

    public Ass() {
        System.out.println("A");
        move();
    }

    public void move() {
        System.out.println(speed);
    }

    public int hashCode() {
        return 0;
    }
}

class Bass extends Ass {

    public Bass() {
        this.speed = 10;
        System.out.println("B");
        move();
    }

    public void move() {
        this.speed++;
        System.out.println(speed);
    }
}


