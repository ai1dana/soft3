package com.media.adapter;

import com.media.player.MediaPlayer;
import com.media.player.MP4Player;

public class MediaPlayerFactory {
    public static MediaPlayer getPlayer(String format) {
        if (format.equalsIgnoreCase("mp3")) {
            return new MP4Player();
        } else {
            return new MediaAdapter(format);
        }
    }
}

