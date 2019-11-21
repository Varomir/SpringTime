package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        Music pop1  = ctx.getBean("pop", PopMusic.class);
        Music pop2  = ctx.getBean("pop", PopMusic.class);
        Music pop3  = ctx.getBean("pop", PopMusic.class);
        System.out.println(pop1.getSong());
        System.out.println(pop2.getSong());
        System.out.println(pop3.getSong());

        MusicPlayer jbl  = ctx.getBean("jbl", MusicPlayer.class);
        jbl.playMusic();

        ctx.close();
    }
}
