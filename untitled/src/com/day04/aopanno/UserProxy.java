package com.day04.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component//创建bean实例
@Aspect//生成代理对象
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* com.day04.aopanno.User.add(..))")//切入点抽取
    public void point_demo(){
    }


    //前置通知
    @Before(value = "point_demo()")
    public void before(){
        System.out.println("前置通知：Before");
    }

    //后置通知
    @AfterReturning(value = "point_demo()")
    public void afterReturning(){
        System.out.println("后置通知：AfterReturning");
    }

    //最终通知
    @After(value = "point_demo()")
    public void after(){
        System.out.println("最终通知：After");
    }

    //异常通知
    @AfterThrowing(value = "point_demo()")
    public void afterThrowing(){
        System.out.println("异常通知：AfterThrowing");
    }

    //环绕通知
    @Around(value = "point_demo()")
    public void Around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕之前....");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后....");
    }
}
