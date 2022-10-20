package com.example.springdatatest;

import com.example.springdatatest.mail.DefaultEmailService;
import com.example.springdatatest.models.EmailDetails;
import com.example.springdatatest.models.Users;
import com.example.springdatatest.teaching.aop.AopBook;
import com.example.springdatatest.teaching.modelMemory.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.ArrayList;
import java.util.Optional;

@SpringBootApplication
public class SpringDataTestApplication {
    @Autowired
    private DefaultEmailService defaultEmailService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataTestApplication.class, args);
        AopBook book = ApplicationContextProvider.getApplicationContext().getBean("book", AopBook.class);
        book.getBook();
        book.renameBook();
        book.returnBook();


    }

    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() {
        defaultEmailService.sendSimpleMessage(
                "dmitrijpol74gmail.com", "hello", "hi from spring boot");
        System.out.println("From Listener");

    }
}
