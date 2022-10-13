package com.example.springdatatest.teaching.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jetbrains.annotations.Contract;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Contract(pure = true)
    @Pointcut("execution(* com.example.springdatatest.teaching.aop.AopBook.rename*())")
    private void allRenamesMethodFromAopBook(){
    }

    @Pointcut("execution(* com.example.springdatatest.teaching.aop.AopBook.return*())")
    private void allReturnMethodFromAopBook(){
    }

    @Before("allRenamesMethodFromAopBook()")
    public void beforeRenameLoggingAdvice(){
        System.out.println("beforeRenameLoggingAdvice: writing log #1");
    }

    @Before("allReturnMethodFromAopBook()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }


}
