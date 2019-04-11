package com.epam.movielib.shawshankredemption;

import com.epam.Language;
import com.epam.movie.Movie;

public class ShawshankRedemption extends Movie {

    public ShawshankRedemption() {
        this.title = "Shawshank Redemption";
    }

    @Override
    public boolean setAudioTrack(Language language) {

        boolean languageSet = true;
        switch (language) {
            case ENGLISH: this.audioTrack = new ShawshankRedemptionAudioEnglish(); break;
            case UKRAINIAN: this.audioTrack = new ShawshankRedemptionAudioUkrainian(); break;
            default: languageSet = false;
        }
        return languageSet;
    }

    @Override
    public boolean setSubtitles(Language language) {

        boolean languageSet = true;
        switch (language) {
            case ENGLISH: this.subtitles = new ShawshankRedemptionSubEnglish(); break;
            case UKRAINIAN: this.subtitles = new ShawshankRedemptionSubUkrainian(); break;
            default: languageSet = false;
        }
        return languageSet;
    }
}
