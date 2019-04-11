package com.epam.movie;

import com.epam.Language;
import com.epam.movielib.diehard.DieHard;
import com.epam.movielib.shawshankredemption.ShawshankRedemption;

public abstract class Movie {

    protected String title;
    protected AudioTrack audioTrack;
    protected Subtitles subtitles;

    public String getTitle() {
        return this.title;
    }

    public String getAudioTrack() {
        return this.audioTrack.toString();
    }

    public String getSubtitles() {
        return this.subtitles.toString();
    }

    public static Movie getMovie(String title) {

        switch (title.toLowerCase()) {
            case "die hard": return new DieHard();
            case "shawshank redemption": return new ShawshankRedemption();
            default: throw new IllegalArgumentException("Movie '" + title + "' not found.");
        }
    }

    public abstract boolean setAudioTrack(Language language);

    public abstract boolean setSubtitles(Language language);
}
