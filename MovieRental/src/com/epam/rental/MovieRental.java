package com.epam.rental;

import com.epam.Language;
import com.epam.movie.Movie;

public abstract class MovieRental {

    public static MovieRental getMovieRental(Language language) {

        switch (language) {
            case ENGLISH: return new MovieRentalEN();
            case UKRAINIAN: return  new MovieRentalUA();
        }
        throw new IllegalArgumentException("No available Movie Rental in '" + language.name() + "' language.");
    }

    public abstract Movie getMovie(String title);
}
