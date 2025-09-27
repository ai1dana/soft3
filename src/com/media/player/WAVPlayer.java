package com.media.player;

public class WAVPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }
}

