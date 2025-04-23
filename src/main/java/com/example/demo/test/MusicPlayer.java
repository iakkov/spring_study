package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    //IoC
    public MusicPlayer(Music music) {
        musicList.add(music);
    }

    public MusicPlayer() {}
    /*public void setMusic(Music music) {
        musicList.add(music);
    }*/
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Playing: " + musicList.get(0).getSong());
        for (int i = 1; i < musicList.size(); i++) {
            System.out.println("In queue: " + musicList.get(i).getSong());
        }
    }
}
