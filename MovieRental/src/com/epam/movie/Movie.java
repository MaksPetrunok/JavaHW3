package com.epam.movie;

public abstract class Movie {

    protected String title;
    protected AudioTrack audioTrack;
    protected Subtitles subtitles;

    public String getTitle() {
        return this.title;
    }

    abstract void setAudioTrack();

    abstract void setSubtitles();
}
