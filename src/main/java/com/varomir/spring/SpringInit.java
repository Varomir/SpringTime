package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer iPod  = ctx.getBean("iPod", MusicPlayer.class);

        iPod.playMusic();
        ctx.close();
    }
}
