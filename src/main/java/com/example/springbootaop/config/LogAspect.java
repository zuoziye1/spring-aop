package com.example.springbootaop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author: 姚飞虎
 * @Date: 2022/4/11 2:49 PM
 * @Description:
 */
@Aspect
@Component
public class LogAspect {

    @Around("execution(* com.example.springbootaop.controller..*(..))")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.out.println("after");
    }

}
