package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer iPod  = ctx.getBean("jbl", MusicPlayer.class);

        iPod.playMusic();
        System.out.println(iPod.getName());
        System.out.println(iPod.getVolume());
        
        ctx.close();
    }
}
