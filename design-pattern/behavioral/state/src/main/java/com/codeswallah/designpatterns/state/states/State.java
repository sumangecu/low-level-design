package com.codeswallah.designpatterns.state.states;

import com.codeswallah.designpatterns.state.ui.MediaPlayer;

public abstract class State {
    MediaPlayer mediaPlayer;

    State(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
