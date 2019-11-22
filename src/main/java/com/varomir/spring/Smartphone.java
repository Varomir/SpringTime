package com.varomir.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Smartphone {
    private String brand;
    private MusicPlayer musicPlayerApp;

    @Autowired
    public Smartphone(MusicPlayer musicPlayerApp) {
        this.brand = "iPhone";
        this.musicPlayerApp = musicPlayerApp;
    }

    public void playMusic() {
        System.out.println(">> Welcome to the " + this.brand + " media player!");
        musicPlayerApp.playMusic();
    }
}
