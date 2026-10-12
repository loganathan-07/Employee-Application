package com.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.EmployeeService.*(..))")
    public void logBeforeMethod() {

        System.out.println("Logging: Service method executing");
    }
}