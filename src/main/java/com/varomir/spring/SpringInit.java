package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer jbl  = ctx.getBean("jbl", MusicPlayer.class);

        jbl.playMusic();
        System.out.println(jbl.getName());
        System.out.println(jbl.getVolume());
        
        ctx.close();
    }
}
