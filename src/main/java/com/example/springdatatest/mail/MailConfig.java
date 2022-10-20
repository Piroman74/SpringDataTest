package com.example.springdatatest.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {
    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.yandex.ru");
        mailSender.setPort(465);

        mailSender.setUsername("dmitrijpol74@yandex.ru");
        mailSender.setPassword("Piromanchik174");

        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.transport.protocol", "smtps");
//        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }
}
