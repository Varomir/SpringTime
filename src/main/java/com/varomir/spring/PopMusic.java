package com.varomir.spring;

public class PopMusic implements Music {

    @Override
    public String getSong() {
        return "Abba - Money, Money, Money";
    }

    public void initBean() {
        System.out.println(">>  Doing some specific PopMusic stuff initialization. Playing 15-seconds advertisements.");
    }

    public void destroyBean() {
        System.out.println(">>  Doing some specific PopMusic stuff destruction. Playing a notification message with the current time.");
    }
}
