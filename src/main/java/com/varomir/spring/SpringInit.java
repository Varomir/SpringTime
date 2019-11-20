package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music music = ctx.getBean("music", Music.class);
        MusicPlayer iPod = new MusicPlayer(music);

        iPod.playMusic();
        ctx.close();
    }
}
