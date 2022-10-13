package com.example.springdatatest.teaching.mapping.mappingConstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Optional;
import java.util.stream.Stream;

// Конструктор копирования
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class BillDTO {
    private Long id;
    private int age;

    public BillDTO(Bill bill) {
        this.id = bill.getId();
        this.age = bill.getAge();
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
class Bill {
    @Id
    private Long id;
    private int age;
}

class Test {
    public static void main(String[] args) {
        Bill bill = new Bill(1L, 21);
        BillDTO billDTO = new BillDTO(bill);
        System.out.println(billDTO);

        // С помощью stream
        Optional<BillDTO> billDTO1 = Stream.of(bill)
                .map(BillDTO::new).findFirst();
        System.out.println(billDTO1.get());
    }
}