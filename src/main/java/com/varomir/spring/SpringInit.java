package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Smartphone smartphone = ctx.getBean("smartphone", Smartphone.class);
        smartphone.playMusic();

        ctx.close();
    }
}
