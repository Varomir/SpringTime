package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music pop1 = ctx.getBean("popMusic", PopMusic.class);
        Music pop2 = ctx.getBean("popMusic", PopMusic.class);
        System.out.println("Are 2 beans are the same: " + (pop1 == pop2));
        System.out.println("pop1.hash=" + pop1.hashCode() + " VS pop2.hash=" + pop2.hashCode());

        ctx.close();
    }
}
