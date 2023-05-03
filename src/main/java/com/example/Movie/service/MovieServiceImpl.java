package com.example.Movie.service;

import com.example.Movie.Model.Movie;
import com.example.Movie.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService  {


    @Autowired
    MovieRepository movieRepository;

    @Override
    public Optional<Movie> movieNameById(int id) {
        Optional<Movie> movie = movieRepository.findById(id);
        return movie;
    }

    @Override
    public List<Movie> movieByGenre(String genre) {
        List<Movie> movieList = (List<Movie>) movieRepository.findAll();
        List<Movie> newMovieList = new ArrayList<>();

        //loop to iterate over the movieList
        for(Movie element : movieList){
            if(element.getMovieGenre().equalsIgnoreCase("Action"))
            {
                newMovieList.add(element);
            }
        }

        return newMovieList;
    }

    @Override
    public List<Movie> movieHallByMovieName(String movieName) {
        List<Movie> movieList = (List<Movie>) movieRepository.findAll();
        List<Movie> newMovieList = new ArrayList<>();

        for(Movie element : movieList){
            if(element.getMovieName().equalsIgnoreCase(movieName))
            {
                newMovieList.add(element);
            }
        }

        return newMovieList;

    }
}
