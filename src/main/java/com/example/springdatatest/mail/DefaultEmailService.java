package com.example.springdatatest.mail;

import com.example.springdatatest.models.EmailDetails;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service(value = "mail")
public class DefaultEmailService {

    private final JavaMailSender javaMailSender;

    public DefaultEmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendSimpleMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("dmitrijpol74@yandex.ru");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        System.out.println("mail has send");
        javaMailSender.send(message);
    }

    public void sendingMail(EmailDetails emailDetails) throws MessagingException {
        MimeMessage message=javaMailSender.createMimeMessage();
        MimeMessageHelper helper;
        helper=new MimeMessageHelper(message,true);
        helper.setTo(emailDetails.getTo());
        helper.setSubject(emailDetails.getSubject());
        helper.setText(emailDetails.getText());
        javaMailSender.send(message);

    }
}
