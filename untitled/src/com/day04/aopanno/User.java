//不知道哪儿有问题
package com.day04.aopanno;

import org.springframework.stereotype.Component;

//要增强的类
@Component//创建bean实例
public class User {
    public void add(){
        System.out.println("这是要增强的类：add");
    }
}
