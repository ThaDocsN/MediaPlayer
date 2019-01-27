package com.example.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.concurrent.ScheduledExecutorService;

public class MediaPlayerHolder implements PlayerAdapter {

    public static final int PLAYBACK_POSITION_REFRESH_INTERVAL_MS = 1000;

    private final Context context;
    private MediaPlayer mediaPlayer;
    private int resourceId;
    private PlaybackInfoListener playbackInfoListener;
    private ScheduledExecutorService executorService;
    private Runnable seekBarPosition;

    private void initializeMediaPlayer(){
        if (mediaPlayer == null){
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopUpdatingCallbackWithPosition(true);
                }
            });
        }
    }

    private void stopUpdatingCallbackWithPosition(boolean resetUIPlaybackPosition) {
        if (executorService != null){
            executorService.shutdownNow();
            executorService = null;
            seekBarPosition = null;
            if (resetUIPlaybackPosition && playbackInfoListener != null){
                playbackInfoListener.onPositionChanged(0);
            }
        }
    }

    @Override
    public void loadMedia(int resourceId) {

    }

    @Override
    public void release() {

    }

    public MediaPlayerHolder(Context context) {
        this.context = context.getApplicationContext();
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
