package com.example.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;

public class MediaPlayerHolder implements PlayerAdapter {

    public static final int PLAYBACK_POSITION_REFRESH_INTERVAL_MS = 1000;

    private final Context context;
    private MediaPlayer mediaPlayer;
    private int resourceId;
    private PlaybackInfoListener playbackInfoListener;

    @Override
    public void loadMedia(int resourceId) {

    }

    @Override
    public void release() {

    }

    public MediaPlayerHolder(Context context) {

    }

    @Override
    public void isPlaying() {

    }

    @Override
    public void play() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void initializeProgressCallback() {

    }

    @Override
    public void seekTo(int position) {

    }
}
