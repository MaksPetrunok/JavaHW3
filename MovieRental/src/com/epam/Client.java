package com.epam;

import com.epam.movie.Movie;

public class Client {

    public static void main(String[] args) {

        MovieRental movieRental = new MovieRental();
        Movie movie = movieRental.getMovie("shawshank redemption", Language.ENGLISH);

        System.out.println("Watching movie: " + movie.getTitle());
        System.out.println("Sound language: " + movie.getAudioTrack());
        System.out.println("Subtitles language: " + movie.getSubtitles());

        System.out.println("\nChange language to Ukrainian.");
        movieRental.setAudioTrack(movie, Language.UKRAINIAN);

        System.out.println("Continue watching movie: " + movie.getTitle());
        System.out.println("Sound language: " + movie.getAudioTrack());
        System.out.println("Subtitles language: " + movie.getSubtitles());

        System.out.println("\nChange language to Italian.");
        movieRental.setAudioTrack(movie, Language.ITALIAN);

        System.out.println("Continue watching movie: " + movie.getTitle());
        System.out.println("Sound language: " + movie.getAudioTrack());
        System.out.println("Subtitles language: " + movie.getSubtitles());
    }
}
