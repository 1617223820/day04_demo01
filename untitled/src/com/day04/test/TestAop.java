package com.day04.test;

import com.day04.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
    @Test
    public void testAnno(){
        ApplicationContext context=new AnnotationConfigApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

}
