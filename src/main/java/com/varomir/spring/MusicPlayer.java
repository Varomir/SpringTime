package com.varomir.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("alternativeMusic")
    private Music alternativeMusic;
    @Autowired
    @Qualifier("rockNRollMusic")
    private Music rockNRollMusic;
    @Autowired
    @Qualifier("popMusic")
    private Music popMusic;
    private List<Music> musicList = Arrays.asList(alternativeMusic, rockNRollMusic, popMusic);
    @Value("${iPod.name}")
    private String name;
    @Value("${iPod.volume}")
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music1, Music music2) {
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

    public void playMusic(MusicType type) {
        System.out.println("Wave " + type);
        String song = "";
        switch (type) {
            case ALTERNATIVE:
                song = getRandomSong(alternativeMusic);
                break;
            case ROCKNROLL:
                song = getRandomSong(rockNRollMusic);
                break;
            case POP:
                song = getRandomSong(popMusic);
                break;
            default:
        }
        System.out.println("Playing random song -> " + song);
    }

    private String getRandomSong(Music music) {
        int rndNum = new Random().nextInt(music.getSong().size());
        return music.getSong().get(rndNum);
    }
}
