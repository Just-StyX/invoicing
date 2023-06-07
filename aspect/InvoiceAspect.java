package org.jbdev.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Random;

@Aspect
public class InvoiceAspect {
    public String invoice() {
        Random random = new Random();
        char[] digits = new char[12];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < 12; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return new String(digits);
    }

    @Around("execution(* org.jbdev.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("\nItems will be delivered within three(3) business days");
        System.out.println("========================================");
        System.out.println("Summary:: Invoice Number: " + invoice());
        System.out.println("========================================");
        joinPoint.proceed();
        System.out.println("Thank you for choosing jbdev");
    }
}
