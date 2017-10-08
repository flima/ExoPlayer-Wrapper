package net.alexandroid.utils.exoplayerlibrary.exo;

import android.widget.ImageView;

public interface ExoPlayerListener {

    void onThumbImageViewReady(ImageView imageView);

    void onLoadingStatusChanged(boolean isLoading);

    void onPlayerPlaying();

    void onPlayerPaused();

    void onPlayerBuffering();

    void onPlayerStateEnded();

    void onPlayerStateIdle();

    void onPlayerError();

    void createExoPlayerCalled();

    void releaseExoPlayerCalled();

    void onVideoResumeDataLoaded(int window, long position, boolean isResumeWhenReady);
}
