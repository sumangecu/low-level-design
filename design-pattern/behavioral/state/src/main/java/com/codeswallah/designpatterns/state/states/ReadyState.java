package com.codeswallah.designpatterns.state.states;

import com.codeswallah.designpatterns.state.ui.MediaPlayer;

public class ReadyState extends State {
    public ReadyState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public String onLock() {
        mediaPlayer.changeState(new LockedState(mediaPlayer));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = mediaPlayer.startPlayback();
        mediaPlayer.changeState(new PlayingState(mediaPlayer));
        return action;
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
