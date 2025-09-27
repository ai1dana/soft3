package com.media.player;

import com.media.adapter.MediaPlayerFactory;

public class AudioPlayer {
    public void play(String fileName, String format) {
        MediaPlayer mediaPlayer = MediaPlayerFactory.getPlayer(format);
        mediaPlayer.play(fileName);
    }

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("song.mp3", "mp3");
        player.play("movie.mp4", "mp4");
        player.play("sound.wav", "wav");
        player.play("music.flac", "flac");
    }
}

