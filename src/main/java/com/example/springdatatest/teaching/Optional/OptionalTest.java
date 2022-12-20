package com.example.springdatatest.teaching.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Owner vasin = new Owner();
        Optional<Owner> owner = Optional.ofNullable(vasin);

        Cat cat = new Cat("Barsik", null, owner);
        Cat cat2 = null;
        String poroda = cat.getPoroda();

        // будет NPE
//        String nameCat2 = cat2.getName();
//        cat.getOwner().getFamilyName();


        //Если мы предполагаем, что передаваемое значение может быть null, то используем другой метод - ofNullable():
        Cat cat1 = Optional.ofNullable(cat2).orElse(new Cat("Stepan", null));
        System.out.println(cat1);

        // .flatMap - если нужно достать из Optional, .map - когда просто поле
        String flatCat = Optional.ofNullable(cat)
                .flatMap(s -> s.getOwner())
                .map(s -> s.getFamilyName())
                .orElse("Blakowsky");
        System.out.println(flatCat);

        // Безопасно достали объект из Optional
        Optional<Owner> optionalOwner = Optional.ofNullable(cat)
                .flatMap(Cat::getOwner);
        Owner shavkin = optionalOwner.orElse(new Owner("Shavkin"));

    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Cat {
    private String name;
    private String poroda;
    private Optional<Owner> owner;

    public Cat(String name, String poroda) {
        this.name = name;
        this.poroda = poroda;
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Owner {
    private String familyName;
}

interface Ad {
    void aaa();
}
interface Bb extends Ad{
    @Override
    default void aaa() {

    }
}
class Ccc implements Bb {


}