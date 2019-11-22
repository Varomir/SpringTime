package com.varomir.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.musicList = Collections.singletonList(music);
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Autowired
    public void customSetterForMusicList(List<Music> musicList) {
        System.out.println(">> Call by '@Autowired'-method annotation. Without calling this method directly from the code!");
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
