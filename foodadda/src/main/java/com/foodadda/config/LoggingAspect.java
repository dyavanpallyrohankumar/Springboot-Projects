package com.foodadda.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.foodadda.service.*.*(..))")
    public void beforeExecution(JoinPoint joinPoint) {
        System.out.println("Before Execution Method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.foodadda.service.*.*(..))")
    public void afterExecution(JoinPoint joinPoint) {
        System.out.println("After Execution Method: " + joinPoint.getSignature().getName());
    }
}
