package com.example.springdatatest.teaching.patterns.fabric;

public class CatFactory {

    public Cat createCat(CatType type) {
        Cat cat = null;
        switch (type) {
            case LION:
                cat = new Lion();
                break;
            case BARSIK:
                cat = new Barsik();
                break;
            case TIGER:
                cat = new Tiger();
                break;
        }
        return cat;
    }
}

class FactoryTest {
    CatFactory catFactory = new CatFactory();
    Cat cat = catFactory.createCat(CatType.LION);


}