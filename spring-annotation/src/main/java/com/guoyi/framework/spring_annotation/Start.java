package com.guoyi.framework.spring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Coder coder = context.getBean("haha", Coder.class);
        System.out.println(coder);
    }
}
