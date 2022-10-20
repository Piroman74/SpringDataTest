//package com.example.springdatatest.controller;
//
//
//import com.example.springdatatest.mail.DefaultEmailService;
//import com.example.springdatatest.models.EmailDetails;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.mail.MessagingException;
//
//// Annotation
//@RestController
//// Class
//public class EmailController {
//
//    private final DefaultEmailService defaultEmailService;
//
//    public EmailController(DefaultEmailService emailService) {
//        this.defaultEmailService = emailService;
//    }
//
//    // Sending a simple Email
//    @GetMapping("/sendMail")
//    public void sendMail() throws MessagingException {
//        EmailDetails details = new EmailDetails();
//        details.setSubject("hhh");
//        details.setText("hi");
//        details.setTo("dmitrijpol74@gmail.com");
//        defaultEmailService.sendSimpleMessage(details);
//    }
//
//}
