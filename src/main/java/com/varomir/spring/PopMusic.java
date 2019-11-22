package com.varomir.spring;

import java.util.Arrays;
import java.util.List;

public class PopMusic implements Music {
    private PopMusic() {
    }

    @Override
    public List<String> getSong() {
        return Arrays.asList("Abba - Money, Money, Money", "Michael Jackson - Billie Jean", "Whitney Houston - Simply The Best");
    }

    public static PopMusic getInstance() {
        System.out.println(">>>> Before create an instance of PopMusic. Playing weather forecast.");
        return new PopMusic();
    }

    public void initBean() {
        System.out.println(">>  Doing some specific PopMusic stuff initialization. Playing 15-seconds advertisements.");
    }

    public void destroyBean() {
        System.out.println(">>  Doing some specific PopMusic stuff destruction. Playing a notification message with the current time.");
    }
}
