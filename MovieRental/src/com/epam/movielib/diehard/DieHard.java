package com.epam.movielib.diehard;

import com.epam.Language;
import com.epam.movie.Movie;

public class DieHard extends Movie {

    public DieHard() {
        this.title = "Die Hard";
    }

    @Override
    public boolean setAudioTrack(Language language) {

        boolean languageSet = true;
        switch (language) {
            case ENGLISH: this.audioTrack = new DieHardAudioEnglish(); break;
            case UKRAINIAN: this.audioTrack = new DieHardAudioUkrainian(); break;
            default: languageSet = false;
        }
        return languageSet;
    }

    @Override
    public boolean setSubtitles(Language language) {

        boolean languageSet = true;
        switch (language) {
            case ENGLISH: this.subtitles = new DieHardSubEnglish(); break;
            case UKRAINIAN: this.subtitles = new DieHardSubUkrainian(); break;
            default: languageSet = false;
        }
        return languageSet;
    }
}
