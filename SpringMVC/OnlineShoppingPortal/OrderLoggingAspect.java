package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderLoggingAspect {

    @Before("execution(* com.example.service.OrderService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Starting method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.service.OrderService.*(..))")
    public void logAfterReturning(JoinPoint joinPoint) {
        System.out.println("Successfully executed: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing(pointcut = "execution(* com.example.service.OrderService.*(..))", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("Exception in method: " + joinPoint.getSignature().getName() + " | Exception: " + error);
    }

    @After("execution(* com.example.service.OrderService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Method execution finished: " + joinPoint.getSignature().getName());
    }
}
