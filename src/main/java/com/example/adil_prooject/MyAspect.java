package com.example.adil_prooject;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect {
    @Before("execution(* com.example.adil_prooject.service.ServiceD*.*(..))")
    public void logBefore(JoinPoint jointPoint){
        log.info("It runs before the method execution. ");
    }
}
