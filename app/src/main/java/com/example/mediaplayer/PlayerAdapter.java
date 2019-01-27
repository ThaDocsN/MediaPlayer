package com.example.mediaplayer;

/*
 * Allow main activity to control playback of MediaPlayerHolder
 * */
public interface PlayerAdapter {

    void loadMedia(int resourceId);
    void release();
    void isPlaying();
    void play();
    void reset();
    void pause();
    void initializeProgressCallback();
}
