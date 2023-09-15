package com.training.fawry.trainingsession.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApplicationAspect {

    @Before(value = "execution(* com.training.fawry.trainingsession.service.FawryService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Fawry Service Before method:" + joinPoint.getSignature());
    }

}
