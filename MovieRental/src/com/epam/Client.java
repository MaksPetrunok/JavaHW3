package com.epam;

import com.epam.movie.Movie;
import com.epam.rental.MovieRental;
import com.epam.rental.MovieRental;

public class Client {

    public static void main(String[] args) {

        MovieRental movieRental = MovieRental.getMovieRental(Language.ENGLISH);
        Movie movie = movieRental.getMovie("die hard");

        System.out.println("Watching movie: " + movie.getTitle());
        System.out.println("Sound track: " + movie.getAudioTrack());
        System.out.println("Subtitles:   " + movie.getSubtitles());

        System.out.println("\nChange language to Ukrainian.");
        movie.setAudioTrack(Language.UKRAINIAN);
        movie.setSubtitles(Language.UKRAINIAN);

        System.out.println("Continue watching movie: " + movie.getTitle());
        System.out.println("Sound track: " + movie.getAudioTrack());
        System.out.println("Subtitles:   " + movie.getSubtitles());

    }
}
