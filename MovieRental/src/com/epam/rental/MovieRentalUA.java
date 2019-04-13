package com.epam.rental;

import com.epam.Language;
import com.epam.movie.Movie;

public class MovieRentalUA extends MovieRental {
    @Override
    public Movie getMovie(String title) {

        Movie movie = Movie.getMovie(title);
        movie.setAudioTrack(Language.UKRAINIAN);
        movie.setSubtitles(Language.UKRAINIAN);
        return movie;
    }
}
