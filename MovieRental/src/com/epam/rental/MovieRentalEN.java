package com.epam.rental;

import com.epam.Language;
import com.epam.movie.Movie;

public class MovieRentalEN extends MovieRental {
    @Override
    public Movie getMovie(String title) {

        Movie movie = Movie.getMovie(title);
        movie.setAudioTrack(Language.ENGLISH);
        movie.setSubtitles(Language.ENGLISH);
        return movie;
    }
}
