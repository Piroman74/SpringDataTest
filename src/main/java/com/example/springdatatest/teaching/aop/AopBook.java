package com.example.springdatatest.teaching.aop;

import org.springframework.stereotype.Component;

@Component("book")
public class AopBook {

    public void getBook(){
        System.out.println("We take a book");
    }

    public void renameBook(){
        System.out.println("Rename book");
    }

    public void returnBook(){
        System.out.println("Return book");
    }
}
