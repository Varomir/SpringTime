package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer radioPlayer = ctx.getBean("musicPlayer", MusicPlayer.class);
        radioPlayer.playMusic(MusicType.ROCKNROLL);

        ctx.close();
    }
}
