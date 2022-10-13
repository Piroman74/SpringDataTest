package com.example.springdatatest;

import com.example.springdatatest.teaching.aop.AopBook;
import com.example.springdatatest.teaching.modelMemory.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataTestApplication.class, args);
        AopBook book = ApplicationContextProvider.getApplicationContext().getBean("book", AopBook.class);
        book.getBook();
        book.renameBook();
        book.returnBook();
//        ApplicationContextProvider.getApplicationContext().getBean("a", A.class);
    }
}
