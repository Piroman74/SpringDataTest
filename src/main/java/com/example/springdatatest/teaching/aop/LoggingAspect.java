package com.example.springdatatest.teaching.aop;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Advice - это метод который находится в аспекте
@Component
@Aspect
public class LoggingAspect {

    // Pointcut - это выражение где должен быть определен Advice, в данном случае это @Before
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: trying get book");
    }

    @AfterReturning(pointcut = "execution(public void getBook())")
    public void AfterGetBookAdvice( ) {
        System.out.println("AfterGetBookAdvice: after trying get book");
    }


}
