package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music alternative  = ctx.getBean("alternativeMusic", AlternativeMusic.class);
        System.out.println("Playing alternative music: " + alternative.getSong());

        ctx.close();
    }
}
