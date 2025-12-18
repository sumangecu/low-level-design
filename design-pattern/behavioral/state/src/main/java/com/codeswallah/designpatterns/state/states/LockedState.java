package com.codeswallah.designpatterns.state.states;

import com.codeswallah.designpatterns.state.ui.MediaPlayer;

public class LockedState extends State {
    public LockedState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
        mediaPlayer.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.changeState(new ReadyState(mediaPlayer));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        mediaPlayer.changeState(new ReadyState(mediaPlayer));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
