package com.varomir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        FirstBean ivan = ctx.getBean("personBean", FirstBean.class);

        System.out.println(String.format("Hello Spring World, my name is %s and I'm %d years old.",
                ivan.getName(), ivan.getAge()));
    }
}
