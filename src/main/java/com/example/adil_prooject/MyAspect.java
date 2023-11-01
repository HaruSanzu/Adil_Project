package com.example.adil_prooject;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect {
    @Before("execution(* com.example.adil_prooject.service.ServiceD*.*(..))")
    public void logBefore(JoinPoint jointPoint) {
        log.info("It runs before the method execution. ");

    }

    @AfterReturning("execution(* com.example.adil_prooject.service..*(..))")
    public void logAfterReturn(JoinPoint joinPoint){
        log.info("Its run after the result is returned by the method");
    }

    @AfterThrowing("execution(* com.example.adil_prooject.service..*(..))")
    public void logAfterThrow(JoinPoint joinPoint){

        log.info("It runs after an exception is thrown by the method");
    }

    @After("execution(* com.example.adil_prooject.serviceC*.*(..))")
    public void logAfterFinally(JoinPoint joinPoint){
        log.info("It is executed after method execution or after an exception is thrown or the result is returned by the method.\n");
    }
}
