package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer radioPlayer = ctx.getBean("musicPlayer", MusicPlayer.class);
        radioPlayer.playMusic(MusicType.ROCKNROLL);
        System.out.println("Player brand: " + radioPlayer.getName());
        System.out.println("Player volume: " + radioPlayer.getVolume());

        ctx.close();
    }
}
