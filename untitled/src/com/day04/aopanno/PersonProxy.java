package com.day04.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//注解方式增强
@Component
@Aspect
@Order(0)//优先级设置，数字越低，优先级越高
public class PersonProxy {
    @Before(value = "execution(* com.day04.aopanno.User.add(..))")
    public void personAdd(){
        System.out.println("这是另一个增强类的前置通知");
    }
}
