package com.media.adapter;

import com.media.player.MediaPlayer;
import com.media.player.MP4Player;
import com.media.player.WAVPlayer;
import com.media.player.FLACPlayer;

public class MediaAdapter implements MediaPlayer {
    private MediaPlayer mediaPlayer;

    public MediaAdapter(String format) {
        if (format.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MP4Player();
        } else if (format.equalsIgnoreCase("wav")) {
            mediaPlayer = new WAVPlayer();
        } else if (format.equalsIgnoreCase("flac")) {
            mediaPlayer = new FLACPlayer();
        }
    }

    @Override
    public void play(String fileName) {
        mediaPlayer.play(fileName);
    }
}
