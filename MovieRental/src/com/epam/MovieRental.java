package com.epam;

import com.epam.movie.Movie;

public class MovieRental {

    public Movie getMovie(String title, Language language) {

        Movie movie = Movie.getMovie(title);
        movie.setAudioTrack(language);
        movie.setSubtitles(language);
        return movie;
    }

    public boolean setAudioTrack(Movie movie, Language language) {
        if (!movie.setAudioTrack(language)) {
            System.out.println("Sorry, " + language.name() + " audio track not found.");
            return false;
        }
        else if (!movie.setSubtitles(language)) {
            System.out.println("Sorry, " + language.name() + " subtitles not found.");
            return false;
        }
        return true;
    }

    public boolean setSubtitles(Movie movie, Language language) {
        if (!movie.setSubtitles(language)) {
            System.out.println("Sorry, " + language.name() + " subtitles not found.");
            return false;
        }
        else if (!movie.setAudioTrack(language)) {
            System.out.println("Sorry, " + language.name() + " audio track not found.");
            return false;
        }
        return true;
    }
}
