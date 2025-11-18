package com.studentmanagement.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.studentmanagement.service.*.*(..))")
    public void beforeMethod(JoinPoint joinpoint) {
        System.out.println(joinpoint.getSignature().getName() + " is Started Execution");
    }

    @After("execution(* com.studentmanagement.service.*.*(..))")
    public void afterMethod(JoinPoint joinpoint) {
        System.out.println(joinpoint.getSignature().getName() + " is Completed Execution");
    }

    @AfterThrowing(pointcut = "execution(* com.studentmanagement.service.*.*(..))", throwing = "ex")
    public void afterException(JoinPoint joinpoint, Exception ex) {
        System.err.println(joinpoint.getSignature().getName() + " is Thrown Exception " + ex.getMessage()
                + " and Location is " + ex.getStackTrace());
    }
}