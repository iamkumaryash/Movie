package com.example.Movie.service;

import com.example.Movie.Model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Optional<Movie> movieNameById(int id);
    List<Movie> movieByGenre(String genre);
    List<Movie> movieHallByMovieName(String movieName);
}
