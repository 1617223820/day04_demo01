package com.day04.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component//创建bean实例
@Aspect//生成代理对象
public class UserProxy {
    //前置通知
    @Before(value = "execution(* com.day04.aopanno.User.add(..))")
    public void before(){
        System.out.println("前置通知：Before");
    }

    //后置通知
    @AfterReturning(value = "execution(* com.day04.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("后置通知：AfterReturning");
    }

    //最终通知
    @After(value = "execution(* com.day04.aopanno.User.add(..))")
    public void after(){
        System.out.println("最终通知：After");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.day04.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("异常通知：AfterThrowing");
    }

    //环绕通知
    @Around(value = "execution(* com.day04.aopanno.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕之前....");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后....");
    }
}
