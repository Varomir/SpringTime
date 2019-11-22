package com.varomir.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(@Qualifier("alternativeMusic") Music music1, @Qualifier("rockNRollMusic") Music music2) {
        this.musicList = Arrays.asList(music1, music2);
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        musicList.forEach(s -> System.out.println(s.getSong()));
    }
}
