package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music alternative = ctx.getBean("alternativeMusic", AlternativeMusic.class);
        Music rockNRoll = ctx.getBean("rockNRollMusic", RockNRollMusic.class);

        MusicPlayer iPod = new MusicPlayer(Arrays.asList(alternative, rockNRoll));
        iPod.playMusic();

        ctx.close();
    }
}
