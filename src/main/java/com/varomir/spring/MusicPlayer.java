package com.varomir.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MusicPlayer {
    private RockNRollMusic rockNRollMusic;
    private AlternativeMusic alternativeMusic;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(RockNRollMusic rockNRollMusic, AlternativeMusic alternativeMusic) {
        this.musicList = Arrays.asList(rockNRollMusic, alternativeMusic);
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
