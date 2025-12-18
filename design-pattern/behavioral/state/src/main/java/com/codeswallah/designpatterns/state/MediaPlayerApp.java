package com.codeswallah.designpatterns.state;

import com.codeswallah.designpatterns.state.ui.MediaPlayer;
import com.codeswallah.designpatterns.state.ui.UI;

public class MediaPlayerApp {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        UI ui = new UI(mediaPlayer);
        ui.init();
    }
}
