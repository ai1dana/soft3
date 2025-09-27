package com.media.player;

public class FLACPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing FLAC file: " + fileName);
    }
}

