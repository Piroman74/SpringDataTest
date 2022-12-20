package com.example.springdatatest.teaching.beanTest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanTest {

    @Bean("hiBean")
    public String abcBean() {
        return "Hi Bean!";
    }


}
