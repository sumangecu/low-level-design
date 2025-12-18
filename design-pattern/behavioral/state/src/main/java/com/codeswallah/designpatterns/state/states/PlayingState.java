package com.codeswallah.designpatterns.state.states;

import com.codeswallah.designpatterns.state.ui.MediaPlayer;

public class PlayingState extends State {
    public PlayingState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public String onLock() {
        mediaPlayer.changeState(new LockedState(mediaPlayer));
        mediaPlayer.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        mediaPlayer.changeState(new ReadyState(mediaPlayer));
        return "Paused...";
    }

    @Override
    public String onNext() {
        return mediaPlayer.nextTrack();
    }

    @Override
    public String onPrevious() {
        return mediaPlayer.previousTrack();
    }
}
