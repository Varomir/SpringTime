package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music alternative  = ctx.getBean("alternativeMusic", AlternativeMusic.class);
        Music rockNRoll  = ctx.getBean("rockNRollMusic", RockNRollMusic.class);
        System.out.println("Playing alternative music: " + alternative.getSong());
        System.out.println("Playing rock'n'roll music: " + rockNRoll.getSong());

        ctx.close();
    }
}
