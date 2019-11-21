package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer jbl  = ctx.getBean("jbl", MusicPlayer.class);
        MusicPlayer bose  = ctx.getBean("jbl", MusicPlayer.class);

        System.out.println("Is JBL and Bose are one instance? - " + (jbl == bose));
        System.out.println();
        System.out.println(jbl.toString());
        System.out.println(bose.toString());

        jbl.setVolume(100);
        System.out.println("JBL  volume is: " + jbl.getVolume());
        System.out.println("Bose volume is: " + bose.getVolume());

        ctx.close();
    }
}
